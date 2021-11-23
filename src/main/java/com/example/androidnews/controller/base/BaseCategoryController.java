package com.example.androidnews.controller.base;

import com.example.androidnews.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class BaseCategoryController {
    @GetMapping("/listCategory")
    public Result listCategory(){
        return null;
    }
}
