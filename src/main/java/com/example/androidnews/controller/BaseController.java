package com.example.androidnews.controller;

import com.example.androidnews.result.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/base")
public class BaseController {
    @GetMapping("/listCategory")
    public Result listCategory(){
        return null;
    }

    @GetMapping("/listComment")
    public Result listComment(){
        return null;
    }

    @GetMapping("/newsList")
    public Result listNews(){
        return null;
    }

    @GetMapping("/newsFind")
    public Result findNews(String newsKey){
        return null;
    }

    @GetMapping("/userFind")
    public Result findUser(String newsKey){
        return null;
    }

    @GetMapping("/queryNew/{url}")
    public Result queryOneNews(@PathVariable String url){
        return null;
    }

    @GetMapping("/queryUser/{url}")
    public Result queryOneUser(@PathVariable String url){
        return null;
    }

    @PutMapping("/register")
    public Result register(@RequestBody String username,
                           @RequestBody String password){
        return null;
    }
    @PostMapping("/login")

    public Result login(@RequestBody String username,
                        @RequestBody String password){
        return null;
    }
}