package com.example.androidnews.service.impl;

import com.example.androidnews.entity.UserPermission;
import com.example.androidnews.mapper.UserPermissionMapper;
import com.example.androidnews.service.IUserPermissionService;
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
public class UserPermissionServiceImpl extends ServiceImpl<UserPermissionMapper, UserPermission> implements IUserPermissionService {

    @Resource
    private UserPermissionMapper userPermissionMapper;

    /**
     * 获取用户权限
     * @param username
     * @return
     */
    @Override
    public List<UserPermission> listPermissionByUsername(String username) {
        return userPermissionMapper.listPermissionByUsername(username);
    }

    /**
     * 删除用户权限
     * @param username 用户名
     * @param userPermission 用户权限
     * @return java.lang.Boolean
     */
    @Override
    public Boolean deletePermission(String username, String userPermission) {
        return userPermissionMapper.deletePermission(username,userPermission) == 1;
    }

    /**
     *  添加用户权限
     * @param username 用户名
     * @param userPermission 用户权限
     * @return java.lang.Boolean
     */
    @Override
    public Boolean insertPermission(String username, String userPermission) {
        return userPermissionMapper.insertPermission(username,userPermission) == 1;
    }
}
