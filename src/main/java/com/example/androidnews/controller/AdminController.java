package com.example.androidnews.controller;

import com.example.androidnews.entity.dto.AdminAddFile;
import com.example.androidnews.entity.dto.AdminAddRole;
import com.example.androidnews.entity.dto.AdminNews;
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
                                 @RequestBody String name){
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
    @RequiresPermissions("manage")
    @RolesAllowed("manager")
    @PutMapping("/addFile")
    public Result addFile(@RequestHeader String token, @RequestBody AdminAddFile adminAddFile){
        return adminServ.addFile(token,
                adminAddFile.getFilename(),
                adminAddFile.getFilePath(),
                adminAddFile.getFileType(), "/addFile");
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
     * @param adminNews 添加的新闻有关的内容
     * @return com.example.androidnews.result.Result
     */
    @RequiresPermissions("manage")
    @RolesAllowed({"supermanager","manager"})
    @PutMapping("/newsAdd")
    public Result addNews(@RequestHeader String token,
                          @RequestBody AdminNews adminNews){
        return adminServ.addNews(token,
                adminNews.getTitle(),
                adminNews.getContent(),
                adminNews.getFile(),
                adminNews.getCategory(),
                adminNews.getType(), "/newsAdd");
    }

    /**
     * 修改新闻
     * @param token 认证token
     * @param newsId 新闻编号
     * @param adminNews 添加的新闻有关的内容
     * @return com.example.androidnews.result.Result
     */
    @RequiresPermissions("manage")
    @RolesAllowed("manager")
    @PostMapping("/newsUpdate/{newsId}")
    public Result updateNews(@RequestHeader String token,
                             @PathVariable String newsId,
                             @RequestBody AdminNews adminNews){
        return adminServ.updateNews(token,newsId,
                adminNews.getTitle(),
                adminNews.getContent(),
                adminNews.getFile(),
                adminNews.getCategory(),
                adminNews.getType(), "/newsUpdate");
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
     * @param adminAddRole 添加的用户权限信息
     * @return com.example.androidnews.result.Result
     */
    @RequiresPermissions("manage")
    @RolesAllowed("supermanager")
    @PostMapping("/updateUserPermission")
    public Result updatePermission(@RequestHeader String token,
                                   @RequestBody AdminAddRole adminAddRole){
        return adminServ.updatePermission(token,adminAddRole.getUsername(),adminAddRole.getRole(),"/updateUserPermission");
    }
}