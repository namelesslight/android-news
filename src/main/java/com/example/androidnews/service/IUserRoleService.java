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

    /**
     * 查询用户的角色
     * @param username 用户名
     * @return java.util.List
     */
    public List<UserRole> listRoleByUsername(String username);

    /**
     * 修改用户角色
     * @param userId 用户名
     * @param role 角色
     * @return java.lang.Boolean
     */
    public Boolean updateRole(String userId,String role);


}
