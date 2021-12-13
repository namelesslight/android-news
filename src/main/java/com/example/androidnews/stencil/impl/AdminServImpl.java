package com.example.androidnews.stencil.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.androidnews.entity.Category;
import com.example.androidnews.entity.User;
import com.example.androidnews.entity.token.JwtToken;
import com.example.androidnews.result.Result;
import com.example.androidnews.service.*;
import com.example.androidnews.stencil.AdminServ;
import com.example.androidnews.util.JWTUtil;
import com.example.androidnews.util.UUIDUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 管理员相关操作
 * @author zcl
 */
@Service
public class AdminServImpl implements AdminServ {

    @Resource
    private ICategoryService categoryService;

    @Resource
    private IAppFileService fileService;

    @Resource
    private INewsService newsService;

    @Resource
    private IUserService userService;

    @Resource
    private IUserRoleService userRoleService;

    @Resource
    private IUserPermissionService userPermissionService;

    /**
     * 修改类别
     * @param token 认证token
     * @param categoryId 类别编号
     * @param name 类别名
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result updateCategory(String token, String categoryId, String name,String path) {
        Map<String ,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            Boolean result = categoryService.updateCategory(categoryId,name);
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result500(resultMap,path);
    }

    /**
     * 删除类别
     * @param token 认证token
     * @param categoryId 类别编号
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result deleteCategory(String token, String categoryId, String path) {
        Map<String ,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            Boolean result = categoryService.deleteCategory(categoryId);
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result500(resultMap,path);
    }

    /**
     * 添加类别
     * @param token 认证token
     * @param categoryName 类别名
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result insertCategory(String token, String categoryName, String path) {
        Map<String ,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            String categoryId = UUIDUtil.getUUID();
            Boolean result = categoryService.insertCategory(categoryId,categoryName);
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result500(resultMap,path);
    }


    /**
     * 删除文件
     * @param token 认证token
     * @param fileId 文件编号
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result deleteFile(String token, String fileId, String path) {
        Map<String ,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            Boolean result = fileService.deleteFile(fileId);
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result500(resultMap,path);
    }

    /**
     * 添加文件
     * @param token 认证token
     * @param filePath 文件路径
     * @param fileType 文件类型
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result addFile(String token,String fileName, String filePath, String fileType,String path) {
        Map<String ,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            String fileId = UUIDUtil.getUUID();
            Boolean result = fileService.insertFile(fileId,fileName,filePath,fileType);
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result500(resultMap,path);
    }

    /**
     * 添加新闻
     * @param token 认证token
     * @param title 新闻标题
     * @param content 新闻内容
     * @param file 新闻文件
     * @param category 新闻类别
     * @param type 新闻类型
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result addNews(String token, String title, String content, String file, String category, String type, String path) {
        Map<String ,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            String newsId = UUIDUtil.getUUID();
            Boolean newsAdd = newsService.insertNews(newsId,title,content,file,category,type);
            resultMap.put("result",newsAdd);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result500(resultMap,path);
    }

    /**
     * 修改新闻
     * @param token 认证token
     * @param newsId 新闻编号
     * @param title 新闻标题
     * @param content 新闻内容
     * @param file 新闻文件
     * @param category 新闻类别
     * @param type 新闻类型
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result updateNews(String token, String newsId, String title, String content, String file, String category, String type, String path) {
        Map<String ,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            Boolean result = newsService.updateNews(newsId,title,content,file,category,type);
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result500(resultMap,path);
    }

    /**
     * 删除新闻
     * @param token 认证token
     * @param newsId 新闻编号
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result deleteNews(String token, String newsId, String path) {
        Map<String ,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            Boolean result = newsService.deleteNews(newsId);
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result500(resultMap,path);
    }

    /**
     * 查询所有用户
     * @param token 认证token
     * @param path URI路径
     * @return com.example.androidnews.result.Result
     */
    @Override
    public Result listUsers(String token, String path) {
        Map<String ,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
            List<User> result = userService.listUsers();
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result500(resultMap,path);
    }

    /**
     * 修改用户权限
     * @param token 认证token
     * @param userId 用户编号
     * @param role 用户权限
     * @param path URI路径
     * @return
     */
    @Override
    public Result updatePermission(String token, String userId, String role, String path) {
        Map<String ,Object> resultMap = new HashMap<>();
        if (JWTUtil.verify(token)){
        Boolean result = null;
            Boolean updateRole= userRoleService.updateRole(userId,role);
            if (updateRole){
                switch (role){
                    case "manager":
                    result = userPermissionService.insertPermission(userId,"manage");
                    break;
                    case "user":
                    result = userPermissionService.deletePermission(userId,"manage");
                    break;
                }
            }
            resultMap.put("result",result);
            return new Result().result200(resultMap,path);
        }
        resultMap.put("result","fail");
        return new Result().result500(resultMap,path);
    }
}
