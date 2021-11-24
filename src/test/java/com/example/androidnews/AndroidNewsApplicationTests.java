package com.example.androidnews;

import com.example.androidnews.service.ICategoryService;
import com.example.androidnews.stencil.AdminServ;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AndroidNewsApplicationTests {

    @Resource
    AdminServ adminServ;

    @Test
    void contextLoads() {
        System.out.println(adminServ);
    }

}
