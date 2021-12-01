package com.example.androidnews.service.impl;

import com.example.androidnews.entity.User;
import com.example.androidnews.mapper.UserMapper;
import com.example.androidnews.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    UserMapper userMapper;

    /**
     * 判断用户名是否重复
     * @param username
     * @return java.util.List
     */
    @Override
    public Boolean existUser(String username) {
        return userMapper.getUserByUsernameCount(username) == 1;
    }

    /**
     * 判断数据创建成功
     * @param username 用户名
     * @param password 密码
     * @return java.util.List
     */
    @Override
    public Boolean register(String username,String password) {
        return userMapper.insertUser(username,password) == 1;
    }

    /**
     * 通过用户名密码查询用户
     * @param username 用户名
     * @param password 密码
     * @return java.util.List
     */
    @Override
    public Boolean login(String username, String password) {
        return userMapper.getUserByNamePasswordCount(username,password) == 1;
    }

    /**
     * 查询用户
     * @param userKeyWord 关键字
     * @return java.util.List
     */
    @Override
    public List<User> findUser(String userKeyWord) {
        return userMapper.findUser(userKeyWord);
    }

    /**
     * 查询所有用户
     * @return java.util.List
     */
    @Override
    public List<User> listUsers() {
        return userMapper.listUser();
    }

    /**
     * 修改个人信息
     * @param username 用户名
     * @param content 个人简介
     * @param icon 头像路径
     * @return java.lang.Boolean
     */
    @Override
    public Boolean updateUserInfo(String username,String content, String icon) {
        return userMapper.updateUserInfo(username,content,icon) == 1;
    }

    /**
     * 修改密码
     * @param username 用户名
     * @param newPassword 新密码
     * @return java.lang.Boolean
     */
    @Override
    public Boolean updatePassword(String username, String newPassword) {
        return userMapper.updatePassword(username,newPassword) == 1;
    }

}
