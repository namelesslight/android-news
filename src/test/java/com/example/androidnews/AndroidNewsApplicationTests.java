package com.example.androidnews;

import com.example.androidnews.service.ICategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AndroidNewsApplicationTests {
    @Resource
    ICategoryService iCategoryService;
    @Test
    void contextLoads() {
        System.out.println(iCategoryService);
    }

}
