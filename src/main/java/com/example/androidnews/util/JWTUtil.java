package com.example.androidnews.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

import java.util.Calendar;
import java.util.Map;

public class JWTUtil {
    private final static String SING="zhaochanglang";
    private final static long EXPIRE_TIME=1000*60*60;
    public static String createToken(Map<String ,String> map){
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE,7);
        JWTCreator.Builder builder =JWT.create();
        map.forEach((key,value) ->{
            builder.withClaim(key,value);
        });
        return builder.withExpiresAt(instance.getTime()).sign(Algorithm.HMAC256(SING));
    }
    public static Boolean verify(String token){
        JWTVerifier jwtVerifier=JWT.require(Algorithm.HMAC256(SING)).build();
        try{
            jwtVerifier.verify(token);
            return true;
        }catch (TokenExpiredException e){
            System.out.println("登录超时");
            return false;
        }catch (JWTDecodeException e){
            System.out.println("解码失败");
            return false;
        }
    }

    public static String getString(String token,String search){
        try {
            return JWT.decode(token).getClaim(search).asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    public static Integer getInteger(String token,String search){
        try {
            return JWT.decode(token).getClaim(search).asInt();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    public static Double getDouble(String token,String search){
        try {
            return JWT.decode(token).getClaim(search).asDouble();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    public static DecodedJWT getTokenInfo(String token){
        //获取 token 得 DecodedJWT
        return JWT.require(Algorithm.HMAC256(SING))
                .build()
                .verify(token);
    }
}
