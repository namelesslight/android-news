package com.example.androidnews.entity.dto;

import lombok.Data;

@Data
public class AdminAddRole {

    /**
     * 用户名
     */
    private String username;

    /**
     * 添加的用户权限
     */
    private String role;
}
