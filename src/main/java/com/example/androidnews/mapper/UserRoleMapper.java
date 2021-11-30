package com.example.androidnews.mapper;

import com.example.androidnews.entity.UserRole;
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
public interface UserRoleMapper extends BaseMapper<UserRole> {

    /**
     * 通过用户名查询权限
     * @param username 用户名
     * @return java.util.List
     */
    public List<UserRole> listRoleByUsername(String username);

    public Integer updateUserRole(String userId,String role);
}
