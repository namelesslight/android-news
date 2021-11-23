package com.example.androidnews.controller.user;

import com.example.androidnews.result.Result;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class AdminFileController {
    @PostMapping("/updateFile")
    public Result updateFile(@RequestBody String fileId){
        return null;
    }

    @PostMapping("/deleteFile")
    public Result deleteFile(@RequestBody String fileId){
        return null;
    }

    @PutMapping("/addFile")
    public Result insertFile(@RequestBody Map<String,Object> map){
        return null;
    }
}