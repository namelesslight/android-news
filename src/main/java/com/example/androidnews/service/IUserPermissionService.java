package com.example.androidnews.service;

import com.example.androidnews.entity.UserPermission;
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
public interface IUserPermissionService extends IService<UserPermission> {
    public List<UserPermission> listPermissionByUsername(String username);
}
