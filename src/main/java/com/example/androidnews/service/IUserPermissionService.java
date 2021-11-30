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
    /**
     * 查询用户的权限
     * @param username 用户名
     * @return java.util.List
     */
    public List<UserPermission> listPermissionByUsername(String username);

    /**
     * 删除用户权限
     * @param username 用户名
     * @param userPermission 用户权限
     * @return java.lang.Boolean
     */
    public  Boolean deletePermission(String username,String userPermission);

    /**
     * 添加用户权限
     * @param username 用户名
     * @param userPermission 用户权限
     * @return java.lang.Boolean
     */
    public Boolean insertPermission(String username,String userPermission);
}
