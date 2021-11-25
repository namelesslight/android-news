package com.example.androidnews.service.impl;

import com.example.androidnews.entity.UserRole;
import com.example.androidnews.mapper.UserRoleMapper;
import com.example.androidnews.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

    @Override
    public List<UserRole> listRoleByUsername(String username) {
        return null;
    }
}
