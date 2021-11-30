package com.example.androidnews;

import com.example.androidnews.util.SecretUtil;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

    @Test
    public void test(){
        System.out.println(SecretUtil.secretString("123456"));
    }

    @Test
    void test1(){
        String file = "aa/dsd/dss.jpg";
        String name = file.substring(file.lastIndexOf("/")+1);
        String fileName = name.replace(name.substring(name.lastIndexOf(".")),"");
        System.out.println(fileName);
    }

}
