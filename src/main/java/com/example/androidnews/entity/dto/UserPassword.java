package com.example.androidnews.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserPassword {

    /**
     * 添加的用户名
     */
    private String username;

    /**
     * 添加的密码
     */
    private String password;

}
