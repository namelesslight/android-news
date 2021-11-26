package com.example.androidnews.stencil.impl;

import com.example.androidnews.result.Result;
import com.example.androidnews.stencil.UserServ;
import org.springframework.context.annotation.Role;
import org.springframework.stereotype.Service;

@Service
public class UserServImpl implements UserServ {

    @Override
    public Result logout(String token, String path) {
        return null;
    }

    @Override
    public Result addComment(String token, String father, String content, String news, String path) {
        return null;
    }

    @Override
    public Result deleteComment(String token, String commentId, String path) {
        return null;
    }

    @Override
    public Result addPraise(String token, String praiseId, String path) {
        return null;
    }

    @Override
    public Result deletePraise(String token, String praiseId, String path) {
        return null;
    }

    @Override
    public Result updateInfo(String token, String content, String icon, String path) {
        return null;
    }

    @Override
    public Result updatePassword(String token,String oldPassword ,String newPassword, String path) {
        return null;
    }
}
