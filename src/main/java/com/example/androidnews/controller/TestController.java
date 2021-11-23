package com.example.androidnews.controller;

import com.example.androidnews.result.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @PostMapping("/base/{url}")
    public Result gotoPath(@PathVariable String url){
        return new Result().result200(url,"base"+url);
    }

    @PostMapping("/path/{url}")
    public Result gotoOtherPath(@PathVariable String url){
        return new Result().result200(url,"base"+url);
    }
}
