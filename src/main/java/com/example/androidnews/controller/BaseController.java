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
    public Result findNews(@RequestBody String newsKeyWord){
        return null;
    }

    @GetMapping("/userFind")
    public Result findUser(@RequestBody String userKeyWord){
        return null;
    }

    @GetMapping("/queryNew/{newsId}")
    public Result queryOneNews(@PathVariable String newsId){
        return null;
    }

    @GetMapping("/queryUser/{newsId}")
    public Result queryOneUser(@PathVariable String newsId){
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