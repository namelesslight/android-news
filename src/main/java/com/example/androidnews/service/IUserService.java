package com.example.androidnews.service;

import com.example.androidnews.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

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

    public Boolean existUser(String username);

    public Boolean register(String username,String password);

    public Boolean login(String username,String password);

    public List<User> findUser(String userKeyWord);

    public Boolean updatePassword(String username,String newPassword);
}
