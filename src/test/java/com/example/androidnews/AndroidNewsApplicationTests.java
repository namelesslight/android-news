package com.example.androidnews;

import com.example.androidnews.entity.UserPermission;
import com.example.androidnews.entity.UserRole;
import com.example.androidnews.mapper.UserPermissionMapper;
import com.example.androidnews.mapper.UserRoleMapper;
import com.example.androidnews.stencil.AdminServ;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class AndroidNewsApplicationTests {

    @Resource
    UserPermissionMapper userPermissionMapper;

    @Resource
    UserRoleMapper userRoleMapper;

    @Resource
    AdminServ adminServ;

    @Test
    void contextLoads() {
        System.out.println(adminServ);
    }

    @Test
    void test(){
        List<UserRole> roles = userRoleMapper.listRoleByUsername("zcl");
        List<UserPermission> permissions = userPermissionMapper.listPermissionByUsername("zcl");
        roles.forEach(r -> System.out.println(r));
        permissions.forEach(p -> System.out.println(p));
    }
}
