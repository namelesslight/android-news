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
    public List<UserPermission> listPermissionByUsername(String username);
}
