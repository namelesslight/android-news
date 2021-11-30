package com.example.androidnews.stencil;

import com.example.androidnews.result.Result;

public interface AdminServ {

    /**
     * 修改类别
     * @param token 认证token
     * @param categoryId 类别编号
     * @param name 类别名
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result updateCategory(String token,String categoryId,String name,String path);

    /**
     * 删除类别
     * @param token 认证token
     * @param categoryId 类别编号
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result deleteCategory(String token,String categoryId,String path);

    /**
     * 删除类别
     * @param token 认证token
     * @param categoryName 类别名
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result insertCategory(String token ,String categoryName,String path);

    /**
     * 删除文件
     * @param token 认证token
     * @param fileId 文件编号
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result deleteFile(String token,String fileId,String path);

    /**
     * 添加新闻
     * @param token 认证token
     * @param title 新闻标题
     * @param content 新闻内容
     * @param file 新闻文件
     * @param category 新闻类别
     * @param type 新闻类型
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result addNews(String token,String title,String content,String file,String category,String type,String path);

    /**
     * 修改新闻
     * @param token 认证token
     * @param newsId 新闻编号
     * @param title 新闻标题
     * @param content 新闻内容
     * @param file 新闻文件
     * @param category 新闻类别
     * @param type 新闻类型
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result updateNews(String token,String newsId,String title,String content,String file,String category,String type,String path);

    /**
     * 删除新闻
     * @param token 认证token
     * @param newsId 新闻编号
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result deleteNews(String token,String newsId,String path);

    /**
     * 查询所有用户
     * @param token 认证token
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result listUsers(String token,String path);

    /**
     * 为用户修改权限
     * @param token 认证token
     * @param userId 用户编号
     * @param role 用户权限
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result updatePermission(String token,String userId,String role,String path);
}
