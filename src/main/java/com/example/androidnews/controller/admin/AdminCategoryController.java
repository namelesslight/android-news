package com.example.androidnews.controller.admin;

import com.example.androidnews.result.Result;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 管路员可执行的操作
 */
@RestController
@RequestMapping("/admin")
public class AdminCategoryController {
    @PostMapping("/categoryUpdate")
    public Result updateCategory(@RequestBody String categoryId){
        return null;
    }

    @PostMapping("/categoryDelete")
    public Result deleteCategory(@RequestBody String categoryId){
        return null;
    }

    @PutMapping("/categoryAdd")
    public Result insertCategory(@RequestBody Map<String,Object> map){
        return null;
    }
}
