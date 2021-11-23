package com.example.androidnews.controller.admin;

import com.example.androidnews.result.Result;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AdminNewsController {
    @PutMapping("/newsAdd")
    public Result addNewsController(@RequestBody Map<String,Object> map){
        return null;
    }

    @PostMapping("/newsUpdate")
    public Result updateNewsController(@RequestBody String newsId){
        return null;
    }

    @PostMapping("/newsDelete")
    public Result deleteNewsController(@RequestBody String newsId){
        return null;
    }
}
