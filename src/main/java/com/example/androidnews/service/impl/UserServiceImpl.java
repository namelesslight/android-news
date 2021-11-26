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
     * @return
     */
    @Override
    public Boolean existUser(String username) {
        return userMapper.getUserByUsernameCount(username) == 1;
    }

    /**
     * 判断数据创建成功
     * @param username
     * @param password
     * @return
     */
    @Override
    public Boolean register(String username,String password) {
        return userMapper.insertUser(username,password) == 1;
    }

    /**
     * 通过用户名密码查询用户
     * @param username
     * @param password
     * @return
     */
    @Override
    public Boolean login(String username, String password) {
        return userMapper.getUserByNamePasswordCount(username,password) == 1;
    }

    /**
     * 查询用户
     * @param userKeyWord
     * @return
     */
    @Override
    public List<User> findUser(String userKeyWord) {
        return userMapper.findUser(userKeyWord);
    }

    /**
     * 更新密码
     * @param username
     * @param newPassword
     * @return
     */
    @Override
    public Boolean updatePassword(String username, String newPassword) {
        return userMapper.updateUserPassword(username,newPassword) == 1;
    }
}
