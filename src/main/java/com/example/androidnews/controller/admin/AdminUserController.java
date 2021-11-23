package com.example.androidnews.controller.admin;

import com.example.androidnews.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
public class AdminUserController {

    @GetMapping("/userList")
    public Result listUsers(){
        return null;
    }

    @PostMapping("/updateUserPermission")
    public Result updateUser(@RequestBody String userid){
        return null;
    }
}
