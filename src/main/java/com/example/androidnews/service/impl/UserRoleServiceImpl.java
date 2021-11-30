package com.example.androidnews.service.impl;

import com.example.androidnews.entity.UserRole;
import com.example.androidnews.mapper.UserRoleMapper;
import com.example.androidnews.service.IUserRoleService;
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
 * @since 2021-11-25
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;

    /**
     * 获取用户角色
     * @param username 用户名
     * @return java.util.List
     */
    @Override
    public List<UserRole> listRoleByUsername(String username) {
        return userRoleMapper.listRoleByUsername(username);
    }

    /**
     * 更新用户权限
     * @param userId 用户名
     * @param role 角色
     * @return java.lang.Boolean
     */
    @Override
    public Boolean updateRole(String userId, String role) {
        return userRoleMapper.updateUserRole(userId,role) == 1;
    }

}
