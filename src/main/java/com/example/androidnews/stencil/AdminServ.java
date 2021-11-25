package com.example.androidnews.stencil;

import com.example.androidnews.result.Result;

public interface AdminServ {

    public Result updateCategory(String token,String categoryId,String name,String path);

    public Result deleteCategory(String token,String categoryId,String path);

    public Result insertCategory(String token ,String categoryName,String path);

    public Result deleteFile(String token,String fileId,String path);

    public Result addNews(String token,String title,String content,String file,String body,String type,String path);

    public Result updateNews(String token,String newsId,String title,String content,String file,String body,String type,String path);

    public Result deleteNews(String token,String newsId,String path);

    public Result listUsers(String token,String path);

    public Result updatePermission(String token,String userId,String role,String path);
}
