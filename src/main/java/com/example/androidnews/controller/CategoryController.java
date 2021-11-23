package com.example.androidnews.controller;


import com.example.androidnews.result.Result;
import com.example.androidnews.service.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    ICategoryService iCategoryService;

    @GetMapping("/base/list")
    public Result listCategory(){
        return new Result().result200(null,"category/base/list");
    }

    @PostMapping("/admin/update")
    public Result updateCategory(){
        return new Result().result200(null,"category/base/list");
    }
}
