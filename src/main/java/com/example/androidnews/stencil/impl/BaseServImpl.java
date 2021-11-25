package com.example.androidnews.stencil.impl;

import com.example.androidnews.result.Result;
import com.example.androidnews.stencil.BaseServ;
import org.springframework.stereotype.Service;

@Service
public class BaseServImpl implements BaseServ {

    @Override
    public Result listCategory(String path) {
        return null;
    }

    @Override
    public Result listComment(String path) {
        return null;
    }

    @Override
    public Result listNews(String path) {
        return null;
    }

    @Override
    public Result findNews(String newsKey, String path) {
        return null;
    }

    @Override
    public Result findUser(String userKeyWord, String path) {
        return null;
    }

    @Override
    public Result queryOneNews(String url, String path) {
        return null;
    }

    @Override
    public Result queryOneUser(String url, String path) {
        return null;
    }

    @Override
    public Result register(String username, String password, String path) {
        return null;
    }

    @Override
    public Result login(String username, String password, String path) {
        return null;
    }
}
