package com.example.androidnews.realm;

import com.example.androidnews.entity.Role;
import com.example.androidnews.entity.User;
import com.example.androidnews.entity.UserPermission;
import com.example.androidnews.entity.UserRole;
import com.example.androidnews.service.IPermissionService;
import com.example.androidnews.service.IUserPermissionService;
import com.example.androidnews.service.IUserRoleService;
import com.example.androidnews.service.IUserService;
import com.example.androidnews.util.JWTUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoginRealm extends AuthorizingRealm {

    @Resource
    private IUserService userService;

    @Resource
    IUserPermissionService userPermissionService;

    @Resource
    IUserRoleService userRoleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = JWTUtil.getString(principalCollection.toString(),"username");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        List<UserPermission> permissions
                = userPermissionService.listPermissionByUsername(username);
        permissions.forEach( permission -> info.addStringPermission(permission.getPermission()));
        List<UserRole> roles
                = userRoleService.listRoleByUsername(username);
        roles.forEach( role -> info.addRole(role.getRole()));
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token = authenticationToken.getPrincipal().toString();
        String username = JWTUtil.getString(token,"username");
        User user = userService.getById(username);
        if (user == null){
            throw new AuthenticationException("用户不存在");
        }
        return new SimpleAuthenticationInfo(token,token,"my_realm");
    }
}
