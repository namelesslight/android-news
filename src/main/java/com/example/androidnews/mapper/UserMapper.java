package com.example.androidnews.mapper;

import com.example.androidnews.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 通过用户名查询用户个数
     * @param username 用户名
     * @return java.lang.Integer
     */
    public Integer getUserByUsernameCount(String username);

    /**
     * 通过用户名和密码查询用户个数
     * @param username 用户名
     * @param password 密码
     * @return java.lang.Integer
     */
    public Integer getUserByNamePasswordCount(String username,String password);

    /**
     * 添加用户
     * @param username 用户名
     * @param password 密码
     * @return java.lang.Integer
     */
    public Integer insertUser(String username,String password);

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
    public List<User> listUser();

    /**
     * 修改个人信息
     * @param content 个人简介
     * @param icon 用户头像
     * @return java.lang.Integer
     */
    public Integer updateUserInfo(String username,String content, String icon);

    /**
     * 修改密码
     * @param username 用户名
     * @param newPassword 新密码
     * @return java.lang.Integer
     */
    public Integer updatePassword(String username, String newPassword);

}
