package com.example.androidnews.stencil;

import com.example.androidnews.result.Result;

public interface UserServ {

    public Result logout(String token,String path);

    public Result addComment(String token,String father,String content,String news,String path);

    public Result deleteComment(String token,String commentId,String path);

    public Result addPraise(String token,String praiseId,String path);

    public Result deletePraise(String token,String praiseId,String path);

    public Result updateInfo(String token,String content,String icon,String path);

    public Result updatePassword(String token,String password,String path);

}
