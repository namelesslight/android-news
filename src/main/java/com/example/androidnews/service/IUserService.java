package com.example.androidnews.service;

import com.example.androidnews.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.androidnews.result.Result;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
public interface IUserService extends IService<User> {

    /**
     * 查询是否存在用户
     * @param username 用户名
     * @return java.lang.Boolean
     */
    public Boolean existUser(String username);

    /**
     * 用户注册
     * @param username 用户名
     * @param password 密码
     * @return java.lang.Boolean
     */
    public Boolean register(String username,String password);

    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return java.lang.Boolean
     */
    public Boolean login(String username,String password);

    /**
     * 通过关键字查询用户
     * @param userKeyWord 关键字
     * @return java.util.List
     */
    public List<User> findUser(String userKeyWord);

    /**
     * 查询所有用户
     * @return java.util.List
     */
    public List<User> listUsers();

    /**
     * 用户修改个人信息
     * @param username 用户名
     * @param content 个人简介
     * @param icon 头像路径
     * @return java.lang.Boolean
     */
    public Boolean updateUserInfo(String username,String content, String icon);

    /**
     * 修改密码
     * @param username 用户名
     * @param newPassword 新密码
     * @return java.lang.Boolean
     */
    public Boolean updatePassword(String username, String newPassword);

    }
