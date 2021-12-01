package com.example.androidnews.entity.dto;

import lombok.Data;

@Data
public class UserUpdatePassword {

    private String newPassword;

    private String oldPassword;
}
