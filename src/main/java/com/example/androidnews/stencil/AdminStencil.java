package com.example.androidnews.stencil;

import com.example.androidnews.result.Result;

public interface AdminStencil<T> {

    public Result insert(T t);

    public Result update(T t);

    public Result delete(T t);

    public Result list();
}
