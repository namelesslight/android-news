package com.example.androidnews.controller;

import com.example.androidnews.result.Result;
import com.example.androidnews.stencil.AdminServ;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    AdminServ adminServ;

    @PostMapping("/categoryUpdate/{categoryId}")
    public Result updateCategory(@RequestHeader String token,
                                 @PathVariable String categoryId,
                                 @RequestBody String name){
        return null;
    }

    @DeleteMapping("/categoryDelete/{categoryId}")
    public Result deleteCategory(@RequestHeader String token,
                                 @PathVariable String categoryId){
        return null;
    }

    @PutMapping("/categoryAdd")
    public Result insertCategory(@RequestHeader String token,
                                 @RequestBody String categoryName){
        return null;
    }

    @DeleteMapping("/deleteFile/{fileId}")
    public Result deleteFile(@RequestHeader String token,
                             @PathVariable String fileId){
        return null;
    }

    @PutMapping("/newsAdd")
    public Result addNews(@RequestHeader String token,
                          @RequestBody String title,
                          @RequestBody String content,
                          @RequestBody String file,
                          @RequestBody String body,
                          @RequestBody String type){
        return null;
    }

    @PostMapping("/newsUpdate/{newsId}")
    public Result updateNews(@RequestHeader String token,
                             @PathVariable String newsId,
                             @RequestBody String title,
                             @RequestBody String content,
                             @RequestBody String file,
                             @RequestBody String body,
                             @RequestBody String type){
        return null;
    }

    @PostMapping("/newsDelete/{newsId}")
    public Result deleteNews(@RequestHeader String token,
                             @PathVariable String newsId){
        return null;
    }

    @GetMapping("/userList")
    public Result listUsers(@RequestHeader String token){
        return null;
    }

    @PostMapping("/super/updateUserPermission")
    public Result updatePermission(@RequestHeader String token,
                             @RequestBody String userId,
                             @RequestBody String role){
        return null;
    }
}