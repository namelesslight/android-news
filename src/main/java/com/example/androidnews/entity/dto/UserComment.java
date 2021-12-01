package com.example.androidnews.entity.dto;

import lombok.Data;

/**
 * @author zcl
 * 用户评论类
 */
@Data
public class UserComment {

    /**
     * 评论父类
     */
    private String father;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论新闻编号
     */
    private  String news;
}
