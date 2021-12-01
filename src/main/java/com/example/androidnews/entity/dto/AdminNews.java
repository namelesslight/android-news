package com.example.androidnews.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AdminNews {

    /**
     * 添加的新闻标题
     */
    private String title;

    /**
     * 添加的新闻内容
     */
    private String content;

    /**
     * 添加的新闻文件
     */
    private String file;

    /**
     * 添加的新闻类别
     */
    private String category;

    /**
     * 添加的新闻类型
     */
    private String type;
}
