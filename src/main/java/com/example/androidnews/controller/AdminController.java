package com.example.androidnews.controller;

import com.example.androidnews.result.Result;
import com.example.androidnews.stencil.AdminServ;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;


@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    AdminServ adminServ;

    /**
     * 修改类别
     * @param token 认证token
     * @param categoryId 类别编号
     * @param name 类别名
     * @return com.example.androidnews.result.Result
     */
    @RequiresPermissions("manage")
    @RolesAllowed("manager")
    @PostMapping("/categoryUpdate/{categoryId}")
    public Result updateCategory(@RequestHeader String token,
                                 @PathVariable String categoryId,
                                 @RequestParam String name){
        return adminServ.updateCategory(token,categoryId,name,"/categoryUpdate");
    }

    /**
     * 删除类别
     * @param token 认证token
     * @param categoryId 类别编号
     * @return com.example.androidnews.result.Result
     */
    @RequiresPermissions("manage")
    @RolesAllowed("manager")
    @DeleteMapping("/categoryDelete/{categoryId}")
    public Result deleteCategory(@RequestHeader String token,
                                 @PathVariable String categoryId){
        return adminServ.deleteCategory(token,categoryId,"/categoryDelete");
    }

    /**
     * 添加类别
     * @param token 认证token
     * @param categoryName 类别名
     * @return com.example.androidnews.result.Result
     */
    @RequiresPermissions("manage")
    @RolesAllowed("manager")
    @PutMapping("/categoryAdd")
    public Result insertCategory(@RequestHeader String token,
                                 @RequestParam String categoryName){
        return adminServ.insertCategory(token,categoryName,"/categoryAdd");
    }

    /**
     * 删除文件
     * @param token 认证token
     * @param fileId 文件编号
     * @return com.example.androidnews.result.Result
     */
    @RequiresPermissions("manage")
    @RolesAllowed("manager")
    @DeleteMapping("/deleteFile/{fileId}")
    public Result deleteFile(@RequestHeader String token,
                             @PathVariable String fileId){
        return adminServ.deleteFile(token,fileId,"deleteFile");
    }

    /**
     * 添加新闻
     * @param token 认证token
     * @param title 新闻标题
     * @param content 新闻内容
     * @param file 新闻文件
     * @param category 新闻标题
     * @param type 新闻类型
     * @return com.example.androidnews.result.Result
     */
    @RequiresPermissions("manage")
    @RolesAllowed("manager")
    @PutMapping("/newsAdd")
    public Result addNews(@RequestHeader String token,
                          @RequestParam String title,
                          @RequestParam String content,
                          @RequestParam String file,
                          @RequestParam String category,
                          @RequestParam String type){
        return adminServ.addNews(token,title,content,file,category,type,"/newsAdd");
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
     * @return com.example.androidnews.result.Result
     */
    @RequiresPermissions("manage")
    @RolesAllowed("manager")
    @PostMapping("/newsUpdate/{newsId}")
    public Result updateNews(@RequestHeader String token,
                             @PathVariable String newsId,
                             @RequestParam String title,
                             @RequestParam String content,
                             @RequestParam String file,
                             @RequestParam String category,
                             @RequestParam String type){
        return adminServ.updateNews(token,newsId,title,content,file,category,type,"/newsUpdate");
    }


    /**
     * 新闻删除
     * @param token 认证token
     * @param newsId 新闻标题
     * @return com.example.androidnews.result.Result
     */
    @RequiresPermissions("manage")
    @RolesAllowed("manager")
    @PostMapping("/newsDelete/{newsId}")
    public Result deleteNews(@RequestHeader String token,
                             @PathVariable String newsId){
        return adminServ.deleteNews(token,newsId,"/newsDelete");
    }

    /**
     * 查询所有用户
     * @param token 认证token
     * @return com.example.androidnews.result.Result
     */
    @RequiresPermissions("manage")
    @RolesAllowed("manager")
    @GetMapping("/userList")
    public Result listUsers(@RequestHeader String token){
        return adminServ.listUsers(token,"/userList");
    }

    /**
     * 更新权限
     * @param token 认证token
     * @param userId 用户名
     * @param role 权限
     * @return com.example.androidnews.result.Result
     */
    @RequiresPermissions("manage")
    @RolesAllowed("supermanager")
    @PostMapping("/updateUserPermission")
    public Result updatePermission(@RequestHeader String token,
                             @RequestParam String userId,
                             @RequestParam String role){
        return adminServ.updatePermission(token,userId,role,"/updateUserPermission");
    }
}