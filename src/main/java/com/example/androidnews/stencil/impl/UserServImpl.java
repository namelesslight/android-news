package com.example.androidnews.stencil.impl;

import com.example.androidnews.result.Result;
import com.example.androidnews.service.ICommentService;
import com.example.androidnews.service.IPraiseService;
import com.example.androidnews.service.IUserService;
import com.example.androidnews.stencil.UserServ;
import com.example.androidnews.util.JWTUtil;
import com.example.androidnews.util.UUIDUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户相关操作
 * @author zcl
 */
@Service
public class UserServImpl implements UserServ {

    @Resource
    ICommentService commentService;

    @Resource
    IPraiseService praiseService;

    @Resource
    IUserService userService;

    /**
     * 用户登出
     * @param token 认证token
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result logout(String token, String path) {
        Map<String,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            Subject subject = SecurityUtils.getSubject();
            if (subject.isAuthenticated()){
                try {
                    subject.logout();
                }catch (Exception e){
                    resultMap.put("result",false);
                    return new Result().result200(resultMap,path);
                }
                resultMap.put("result",true);
                return new Result().result200(resultMap,path);

            }
        resultMap.put("result","no authenticated");
        return new Result().result200(resultMap,path);
        }
        resultMap.put("result","unlogin");
        return new Result().result200(resultMap,path);
    }

    /**
     * 添加评论
     * @param token 认证token
     * @param father 评论父类
     * @param content 评论内容
     * @param news 评论新闻
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result addComment(String token, String father, String content, String news, String path) {
        Map<String,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            String commentId = UUIDUtil.getUUID();
            String username = JWTUtil.getString(token,"username");
            Boolean result = commentService.addComment(commentId,father,commentId,username,news);
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result200(resultMap,path);
    }

    /**
     * 删除评论
     * @param token 认证token
     * @param commentId 评论编号
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result deleteComment(String token, String commentId, String path) {
        Map<String,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            Boolean result = commentService.deleteComment(commentId);
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result200(resultMap,path);
    }

    /**
     * 添加点赞
     * @param token 认证token
     * @param commentId 新闻编号
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result addPraise(String token, String commentId, String path) {
        Map<String,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            String praiseId = UUIDUtil.getUUID();
            String username = JWTUtil.getString(token,"username");
            Boolean result = praiseService.addPraise(praiseId,commentId,username);
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result200(resultMap,path);
    }

    /**
     * 删除点赞
     * @param token 认证token
     * @param praiseId 点赞编号
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result deletePraise(String token, String praiseId, String path) {
        Map<String,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            Boolean result = praiseService.deletePraise(praiseId);
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result200(resultMap,path);
    }

    /**
     * 更新个人信息
     * @param token 认证token
     * @param content 更新简介
     * @param icon 更新头像
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result updateInfo(String token, String content, String icon, String path) {
        Map<String,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            String username = JWTUtil.getString(token,"username");
            Boolean result = userService.updateUserInfo(username,content,icon);
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result200(resultMap,path);
    }

    /**
     * 更新密码
     * @param token 认证token
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result updatePassword(String token,String oldPassword ,String newPassword, String path) {
        Map<String,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            String username = JWTUtil.getString(token,"username");
            if (userService.login(username,oldPassword)){
                Boolean result = userService.updatePassword(username,newPassword);
                resultMap.put("result",result);
                return new Result().result200(resultMap,path);
            }
            resultMap.put("result",false);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result200(resultMap,path);
    }
}
