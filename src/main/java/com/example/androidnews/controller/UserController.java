package com.example.androidnews.controller;

import com.example.androidnews.result.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/logout")
    public Result logout(@RequestHeader String token){
        return null;
    }

    @PutMapping("/addComment")
    public Result addComment(@RequestHeader String token,
                             @RequestBody String father,
                             @RequestBody String content,
                             @RequestBody String news){
        return null;
    }

    @DeleteMapping("/deleteComment")
    public Result deleteComment(@RequestHeader String token ,
                                @RequestBody String commentId){
        return null;
    }

    @PutMapping("/addPraise")
    public Result addPraise(@RequestHeader String token,
                            @RequestBody String commentId){
        return null;
    }

    @DeleteMapping("/deletePraise")
    public Result deletePraise(@RequestHeader String token,
                               @RequestBody String commentId){
        return null;
    }

    @PostMapping("/updateInfo")
    public Result updateInfo(@RequestHeader String token,
                             @RequestBody String content,
                             @RequestBody String icon){
        return null;
    }

    @PostMapping("/updatePassword")
    public Result updatePassword(@RequestHeader String token,
                             @RequestBody String password){
        return null;
    }
}
