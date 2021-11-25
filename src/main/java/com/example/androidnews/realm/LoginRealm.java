package com.example.androidnews.realm;

import com.example.androidnews.entity.User;
import com.example.androidnews.service.IPermissionService;
import com.example.androidnews.service.IUserPermissionService;
import com.example.androidnews.service.IUserRoleService;
import com.example.androidnews.service.IUserService;
import com.example.androidnews.util.JWTUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

public class LoginRealm extends AuthorizingRealm {

    @Resource
    private IUserService userService;

    @Resource
    IUserPermissionService iUserPermissionService;

    @Resource
    IUserRoleService roleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = JWTUtil.getString(principalCollection.toString(),"username");
        User user = userService.getById(username);
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
