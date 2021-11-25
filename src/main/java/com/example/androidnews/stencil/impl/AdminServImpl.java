package com.example.androidnews.stencil.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.androidnews.entity.Category;
import com.example.androidnews.entity.token.JwtToken;
import com.example.androidnews.result.Result;
import com.example.androidnews.service.*;
import com.example.androidnews.stencil.AdminServ;
import com.example.androidnews.util.JWTUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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
    private IPermissionService permissionService;

    @Override
    public Result updateCategory(String token, String categoryId, String name,String path) {
        Map<String ,Object> map = new HashMap<>();
        if (JWTUtil.verify(token)){
            UpdateWrapper<Category> wrapper = new UpdateWrapper<>();
            wrapper.set("name",name);
            wrapper.eq("id",categoryId);
            Boolean update = categoryService.update(wrapper);
            map.put("result",update);
            return new Result().result200(map,path);
        }
        map.put("result","token验证失败");
        return new Result().result404(map,path);
    }

    @Override
    public Result deleteCategory(String token, String categoryId, String path) {
        return null;
    }

    @Override
    public Result insertCategory(String token, String categoryName, String path) {
        return null;
    }

    @Override
    public Result deleteFile(String token, String fileId, String path) {
        return null;
    }

    @Override
    public Result addNews(String token, String title, String content, String file, String body, String type, String path) {
        return null;
    }

    @Override
    public Result updateNews(String token, String newsId, String title, String content, String file, String body, String type, String path) {
        return null;
    }

    @Override
    public Result deleteNews(String token, String newsId, String path) {
        return null;
    }

    @Override
    public Result listUsers(String token, String path) {
        return null;
    }

    @Override
    public Result updatePermission(String token, String userId, String role, String path) {
        return null;
    }


}
