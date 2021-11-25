package com.example.androidnews.service;

import com.example.androidnews.entity.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zcl
 * @since 2021-11-25
 */
public interface IUserRoleService extends IService<UserRole> {
    public List<UserRole> listRoleByUsername(String username);
}
