package com.example.androidnews;

import com.example.androidnews.entity.User;
import com.example.androidnews.entity.UserPermission;
import com.example.androidnews.entity.UserRole;
import com.example.androidnews.entity.token.JwtToken;
import com.example.androidnews.mapper.UserMapper;
import com.example.androidnews.mapper.UserPermissionMapper;
import com.example.androidnews.mapper.UserRoleMapper;
import com.example.androidnews.service.ICategoryService;
import com.example.androidnews.service.IUserPermissionService;
import com.example.androidnews.service.IUserRoleService;
import com.example.androidnews.service.IUserService;
import com.example.androidnews.stencil.AdminServ;
import com.example.androidnews.util.JWTUtil;
import com.example.androidnews.util.SecretUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SubjectFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class AndroidNewsApplicationTests {

    @Resource
    IUserPermissionService userPermissionService;

    @Resource
    IUserRoleService userRoleService;

    @Resource
    DefaultWebSecurityManager manager;

    @Resource
    IUserService userService;

    @Test
    void contextLoads() {
        System.out.println(SecretUtil.secretString("123456"));
        System.out.println(SecretUtil.secretString("123456"));
        System.out.println(SecretUtil.secretString("123456"));
    }


    @Test
    void test1(){
        System.out.println(userPermissionService);
        System.out.println(userRoleService);
        List<UserRole> roles = userRoleService.listRoleByUsername("zcl");
        List<UserPermission> permissions = userPermissionService.listPermissionByUsername("zcl");
        roles.forEach(r -> System.out.println(r));
        permissions.forEach(p -> System.out.println(p));
    }

    @Test
    void test(){

    }

    @Test
    void  shiroTest(){
        SecurityUtils.setSecurityManager(manager);
        Subject subject = SecurityUtils.getSubject();
        Map<String,String> map = new HashMap<>();
        map.put("username","zcl");
        String token = JWTUtil.createToken(map);
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(token,token);
//        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("zcl","123456");
        subject.login(usernamePasswordToken);
        System.out.println(subject.isAuthenticated());
        System.out.println(subject.hasRole("supermanager"));
    }

    @Resource
    UserMapper userMapper;

    @Test
    void userTest(){
        System.out.println(userService.existUser("zcl"));
        System.out.println(userMapper.getUserByNamePasswordCount("zcl",SecretUtil.secretString("123456")));
        System.out.println(userService.login("zcl",SecretUtil.secretString("123456")));
//        System.out.println(userService.register("hqb",SecretUtil.secretString("123456")));
        System.out.println(userService.login("hqb",SecretUtil.secretString("123456")));
    }

    @Resource
    ICategoryService categoryService;


}
