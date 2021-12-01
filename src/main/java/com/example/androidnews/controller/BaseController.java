package com.example.androidnews.controller;

import com.example.androidnews.entity.dto.UserPassword;
import com.example.androidnews.result.Result;
import com.example.androidnews.stencil.BaseServ;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zcl
 */
@RestController
@RequestMapping("/base")
public class BaseController {

    @Resource
    BaseServ baseServ;

    /**
     * 获取类别数据
     * @return com.example.androidnews.result.Result
     */
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
    @GetMapping("/listComment")
    public Result listComment(@RequestParam String newsId,@RequestParam String commentFather){
        return baseServ.listComment(newsId,commentFather,"/listComment");
    }

    /**
     * 获取新闻数据
     * @return com.example.androidnews.result.Result
     */
    @GetMapping("/newsList")
    public Result listNews(){
        return baseServ.listNews("/newsList");
    }

    /**
     * 通过类别获取新闻
     * @param categoryId 类别编号
     * @return com.example.androidnews.result.Result
     */
    @GetMapping("/listNewsByCategory")
    public Result listNewsByCategory(@RequestParam String categoryId){
        return baseServ.listNewsByCategory(categoryId,"/listNewsByCategory");
    }

    /**
     * 查询新闻数据
     * @return com.example.androidnews.result.Result
     */
    @GetMapping("/newsFind")
    public Result findNews(@RequestBody String newsKeyWord){
        return baseServ.findNews(newsKeyWord,"/newsFind");
    }

    /**
     * 查询用户数据
     * @return com.example.androidnews.result.Result
     */
    @GetMapping("/userFind")
    public Result findUser(@RequestBody String userKeyWord){
        return baseServ.findUser(userKeyWord,"/newsFind");
    }

    /**
     * 用户注册
     * @param up 用户名和密码
     * @return com.example.androidnews.result.Result
     */
    @PutMapping("/register")
    public Result register(@RequestBody UserPassword up){
        return baseServ.register(up.getUsername(),up.getPassword(),"/register");
    }

    /**
     * 用户登录
     * @param up 用户名和密码
     * @return com.example.androidnews.result.Result
     */
    @PostMapping("/login")
    public Result login(@RequestBody UserPassword up){
        return baseServ.login(up.getUsername(),up.getPassword(),"/login");
    }
}