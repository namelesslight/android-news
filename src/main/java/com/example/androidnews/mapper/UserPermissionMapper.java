package com.example.androidnews.mapper;

import com.example.androidnews.entity.UserPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zcl
 * @since 2021-11-25
 */
@Repository
public interface UserPermissionMapper extends BaseMapper<UserPermission> {
    /**
     * 通过用户名查询用户权限
     * @param username 用户名
     * @return java.util.List
     */
    public List<UserPermission> listPermissionByUsername(String username);

    /**
     * 删除用户权限
     * @param username 用户名
     * @param userPermission 用户权限
     * @return java.lang.Integer
     */
    public Integer deletePermission(String username, String userPermission);

    /**
     * 添加用户权限
     * @param username 用户名
     * @param userPermission 用户权限
     * @return java.lang.Integer
     */
    public Integer insertPermission(String username, String userPermission);
}
