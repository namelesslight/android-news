package com.example.androidnews.controller;

import com.example.androidnews.entity.dto.UserPassword;
import com.example.androidnews.result.Result;
import com.example.androidnews.stencil.BaseServ;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zcl
 */
@Api("不需要认证就可执行的操作")
@RestController
@RequestMapping("/base")
public class BaseController {

    @Resource
    BaseServ baseServ;

    /**
     * 获取类别数据
     * @return com.example.androidnews.result.Result
     */
    @ApiOperation("获取全部类别")
    @GetMapping("/listCategory")
    public Result listCategory(){
        return baseServ.listCategory("/listCategory");
    }

    /**
     * 获取评论
     * @param newsId 新闻id
     * @param commentFather 评论父类
     * @return
     */
    @ApiOperation("获取全部评论")
    @ApiImplicitParams
            ({@ApiImplicitParam(name = "newsId",value = "新闻编号",dataType = "String",required = true),
            @ApiImplicitParam(name ="commentFather",value = "评论父类", dataType = "String",required = true)})
    @GetMapping("/listComment")
    public Result listComment(@RequestParam String newsId,@RequestParam String commentFather){
        return baseServ.listComment(newsId,commentFather,"/listComment");
    }

    /**
     * 获取新闻数据
     * @return com.example.androidnews.result.Result
     */
    @ApiOperation("获取全部新闻")
    @GetMapping("/newsList")
    public Result listNews(){
        return baseServ.listNews("/newsList");
    }

    /**
     * 通过类别获取新闻
     * @param categoryId 类别编号
     * @return com.example.androidnews.result.Result
     */
    @ApiOperation("通过新闻类别获取新闻")
    @ApiImplicitParam(name = "categoryId",value = "类别编号",dataType = "String",required = true)
    @GetMapping("/listNewsByCategory")
    public Result listNewsByCategory(@RequestParam String categoryId){
        return baseServ.listNewsByCategory(categoryId,"/listNewsByCategory");
    }

    /**
     * 查询新闻数据
     * @return com.example.androidnews.result.Result
     */
    @ApiOperation("搜索新闻")
    @ApiImplicitParam(name = "newsKeyWord",value = "新闻关键词",dataType = "String",required = true)
    @GetMapping("/newsFind")
    public Result findNews(@RequestBody String newsKeyWord){
        return baseServ.findNews(newsKeyWord,"/newsFind");
    }

    /**
     * 查询用户数据
     * @return com.example.androidnews.result.Result
     */
    @ApiOperation("搜索用户")
    @ApiImplicitParam(name = "userKeyWord",value = "用户关键词",dataType = "String",required = true)
    @GetMapping("/userFind")
    public Result findUser(@RequestBody String userKeyWord){
        return baseServ.findUser(userKeyWord,"/newsFind");
    }

    /**
     * 用户注册
     * @param up 用户名和密码
     * @return com.example.androidnews.result.Result
     */
    @ApiOperation("注册")
    @ApiImplicitParam(name = "up",value = "注册的用户的用户名和密码", dataType = "UserPassword",required = true)
    @PutMapping("/register")
    public Result register(@RequestBody UserPassword up){
        return baseServ.register(up.getUsername(),up.getPassword(),"/register");
    }

    /**
     * 用户登录
     * @param up 用户名和密码
     * @return com.example.androidnews.result.Result
     */
    @ApiOperation("登录")
    @ApiImplicitParam(name = "up",value = "注册的用户的用户名和密码", dataType = "UserPassword")
    @PostMapping("/login")
    public Result login(@RequestBody UserPassword up){
        return baseServ.login(up.getUsername(),up.getPassword(),"/login");
    }
}