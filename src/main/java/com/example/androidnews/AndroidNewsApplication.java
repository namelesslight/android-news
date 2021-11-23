package com.example.androidnews;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.example.androidnews.mapper")
public class AndroidNewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndroidNewsApplication.class, args);
    }

}
