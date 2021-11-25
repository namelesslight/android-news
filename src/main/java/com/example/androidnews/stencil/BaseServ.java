package com.example.androidnews.stencil;

import com.example.androidnews.result.Result;

public interface BaseServ {

    public Result listCategory(String path);

    public Result listComment(String path);

    public Result listNews(String path);

    public Result findNews(String newsKey,String path);

    public Result findUser(String userKeyWord,String path);

    public Result queryOneNews(String url,String path);

    public Result queryOneUser(String url,String path);

    public Result register(String username,String password,String path);

    public Result login(String username,String password,String path);

}
