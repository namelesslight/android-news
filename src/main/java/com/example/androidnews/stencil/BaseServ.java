package com.example.androidnews.stencil;

import com.example.androidnews.result.Result;

public interface BaseServ {

    public Result listCategory(String path);

    public Result listComment(String newsId,String commentFather,String path);


    public Result listNews(String path);

    public Result listNewsByCategory(String categoryId,String path);

    public Result findNews(String newsKey,String path);

    public Result findUser(String userKeyWord,String path);

    public Result register(String username,String password,String path);

    public Result login(String username,String password,String path);

}
