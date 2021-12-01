package com.example.androidnews.stencil;

import com.example.androidnews.result.Result;

public interface BaseServ {

    /**
     * 获取全部类别
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result listCategory(String path);

    /**
     * 根据新闻获取评论
     * @param newsId 用户名
     * @param commentFather 评论父类
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result listComment(String newsId,String commentFather,String path);

    /**
     * 获取全部新闻
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result listNews(String path);

    /**
     * 根据类别获取新闻
     * @param categoryId 类别编号
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result listNewsByCategory(String categoryId,String path);

    /**
     * 查询新闻
     * @param newsKey 关键字
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result findNews(String newsKey,String path);

    /**
     * 查询用户
     * @param userKeyWord 关键字
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result findUser(String userKeyWord,String path);

    /**
     * 注册
     * @param username 用户名
     * @param password 密码
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result register(String username,String password,String path);

    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result login(String username,String password,String path);

}
