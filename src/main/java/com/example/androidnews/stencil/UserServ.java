package com.example.androidnews.stencil;

import com.example.androidnews.result.Result;

public interface UserServ {

    /**
     * 登出
     * @param token 认证token
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result logout(String token,String path);

    /**
     * 添加评论
     * @param token 认证token
     * @param father 评论父类
     * @param content 评论内容
     * @param news 评论新闻
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result addComment(String token,String father,String content,String news,String path);

    /**
     * 删除评论
     * @param token 认证token
     * @param commentId 评论编号
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result deleteComment(String token,String commentId,String path);

    /**
     * 添加点赞
     * @param token 认证token
     * @param commentId 用户id
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result addPraise(String token,String commentId,String path);

    /**
     * 删除点赞
     * @param token 认证token
     * @param praiseId 点赞编号
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result deletePraise(String token,String praiseId,String path);

    /**
     * 更新用户数据
     * @param token 认证token
     * @param content 更新简介
     * @param icon 更新头像
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result updateInfo(String token,String content,String icon,String path);

    /**
     * 更新密码
     * @param token 认证token
     * @param oldPassword 旧密码
     * @param password 新密码
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    public Result updatePassword(String token,String oldPassword ,String password,String path);

}
