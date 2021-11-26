package com.example.androidnews.stencil.impl;

import com.example.androidnews.entity.*;
import com.example.androidnews.result.Result;
import com.example.androidnews.service.*;
import com.example.androidnews.stencil.BaseServ;
import com.example.androidnews.util.JWTUtil;
import com.example.androidnews.util.SecretUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zcl
 * 基础类
 */
@Service
public class BaseServImpl implements BaseServ {

    @Resource
    IUserService userService;

    @Resource
    IUserRoleService userRoleService;

    @Resource
    IRoleService roleService;

    @Resource
    IUserPermissionService userPermissionService;

    @Resource
    IPermissionService permissionService;

    @Resource
    ICategoryService categoryService;

    @Resource
    ICommentService commentService;

    @Resource
    INewsService newsService;

    /**
     * 获取类别
     * @param path URL路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result listCategory(String path) {
        List<Category> categories = categoryService.listCategory();
        Map<String ,Object> resultMap = new HashMap<>();
        resultMap.put("result",categories);
        return new Result().result200(resultMap,path);
    }


    @Override
    public Result listComment(String newsId,String commentFather,String path) {
        List<Comment> comments = commentService.listComment(newsId,commentFather);
        Map<String ,Object> resultMap = new HashMap<>();
        resultMap.put("result",comments);
        return new Result().result200(resultMap,path);
    }

    /**
     * 获取新闻
     * @param path URL路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result listNews(String path) {
        List<News> news = newsService.listNews();
        Map<String ,Object> resultMap = new HashMap<>();
        resultMap.put("result",news);
        return new Result().result200(resultMap,path);
    }

    /**
     *
     * @param categoryId
     * @param path
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result listNewsByCategory(String categoryId, String path) {
        List<News> news = newsService.listByCategory(categoryId);
        Map<String ,Object> resultMap = new HashMap<>();
        resultMap.put("result",news);
        return new Result().result200(resultMap,path);
    }

    /**
     * 根据关键字查询新闻
     * @param newsKey 关键字
     * @param path URL路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result findNews(String newsKey, String path) {
        List<News> news = newsService.findNews(newsKey);
        Map<String ,Object> resultMap = new HashMap<>();
        resultMap.put("result",news);
        return new Result().result200(news,path);
    }

    /**
     * 根据关键字查询用户
     * @param userKeyWord 关键字
     * @param path URL路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result findUser(String userKeyWord, String path) {
        List<User> users = userService.findUser(userKeyWord);
        Map<String ,Object> resultMap = new HashMap<>();
        resultMap.put("result",userKeyWord);
        return new Result().result200(resultMap,path);
    }

    /**
     * 用户注册
     * @param username 注册用户名
     * @param password 注册密码
     * @param path URL路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result register(String username, String password, String path) {
        Map<String ,Object> resultMap = new HashMap<>();
        Boolean hasUser = userService.existUser(username);
        if (hasUser){
            resultMap.put("result",false);
            return new Result().result500(resultMap,path);
        }
        Boolean register = userService.register(username, SecretUtil.secretString(password));
        //获取role表中的user角色
        Role role = roleService.getById(3);
        userRoleService.save(new UserRole(username,role.getRole()));
        List<Permission> permissions = permissionService.list();
        //将用户基础权限添加到用户中
        for (int i = 2;i<permissions.toArray().length;i++){
            Permission permission = permissions.get(i);
            userPermissionService.save(new UserPermission(username,permission.getPermission()));
        }
        resultMap.put("result",register);
        return new Result().result200(resultMap,path);
    }

    /**
     * 用户登录
     * @param username 登录用户名
     * @param password 登录密码
     * @param path  URL路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result login(String username, String password, String path) {
        Boolean result = userService.login(username,SecretUtil.secretString(password));
        Map<String ,Object> resultMap = new HashMap<>();
        if (result){
            Map<String,String> claims = new HashMap<>();
            claims.put("username",username);
            claims.put("password",password);
            String token = JWTUtil.createToken(claims);
            resultMap.put("token",token);
            resultMap.put("result",true);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result",false);
        return new Result().result500(resultMap,path);
    }

//    /**
//     * 为新注册的用户添加基础权限
//     * @param username 用户名
//     * @return com.example.androidnews.result.Result
//     */
//    private Boolean addRoleAndPermission(String username){
//
////        Boolean givePermissions = false;
////            if (i==permissions.toArray().length){
////                givePermissions = true;
////            }
////        return giveRole && givePermissions;
//    }

}