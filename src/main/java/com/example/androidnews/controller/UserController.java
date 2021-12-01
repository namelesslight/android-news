package com.example.androidnews.controller;

import com.example.androidnews.entity.dto.UserComment;
import com.example.androidnews.entity.dto.UserUpdateInfo;
import com.example.androidnews.entity.dto.UserUpdatePassword;
import com.example.androidnews.result.Result;
import com.example.androidnews.stencil.UserServ;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zcl
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    UserServ userServ;

    /**
     * 登出
     * @param token 认证token
     * @return com.example.androidnews.result.Result
     */
    @PostMapping("/logout")
    public Result logout(@RequestHeader String token){
        return userServ.logout(token,"/logout");
    }

    /**
     * 添加评论
     * @param token 认证token
     * @param userComment 用户评论信息
     * @return com.example.androidnews.result.Result
     */
    @PutMapping("/addComment")
    public Result addComment(@RequestHeader String token,
                             @RequestBody UserComment userComment){
        return userServ.addComment(token,
                userComment.getFather(),
                userComment.getContent(),
                userComment.getNews(),"/addComment");
    }

    /**
     * 删除评论
     * @param token 认证token
     * @param commentId 评论编号
     * @return com.example.androidnews.result.Result
     */
    @DeleteMapping("/deleteComment")
    public Result deleteComment(@RequestHeader String token ,
                                @RequestParam String commentId){
        return userServ.deleteComment(token,commentId,"/deleteComment");
    }

    /**
     * 添加点赞
     * @param token 认证token
     * @param commentId 评论编号
     * @return com.example.androidnews.result.Result
     */
    @PutMapping("/addPraise")
    public Result addPraise(@RequestHeader String token,
                            @RequestBody String commentId){
        return userServ.addPraise(token,commentId,"/addPraise");
    }

    /**
     * 删除点赞
     * @param token 认证token
     * @param praiseId 点赞编号
     * @return com.example.androidnews.result.Result
     */
    @DeleteMapping("/deletePraise")
    public Result deletePraise(@RequestHeader String token,
                               @RequestParam String praiseId){
        return userServ.deletePraise(token,praiseId,"/deletePraise");
    }

    /**
     * 用户修改个人信息
     * @param token 认证token
     * @param userUpdateInfo 用户修改信息
     * @return com.example.androidnews.result.Result
     */
    @PostMapping("/updateInfo")
    public Result updateInfo(@RequestHeader String token,
                             @RequestBody UserUpdateInfo userUpdateInfo){
        return userServ.updateInfo(token,
                userUpdateInfo.getContent(),
                userUpdateInfo.getIcon(),
                "/updateInfo");
    }

    /**
     * 修改密码
     * @param token 认证token
     * @param userUpdatePassword 修改密码信息
     * @return com.example.androidnews.result.Result
     */
    @PostMapping("/updatePassword")
    public Result updatePassword(@RequestHeader String token,
                                 @RequestBody UserUpdatePassword userUpdatePassword){
        return userServ.updatePassword(token,
                userUpdatePassword.getOldPassword(),
                userUpdatePassword.getNewPassword(),
                "/updatePassword");
    }
}
