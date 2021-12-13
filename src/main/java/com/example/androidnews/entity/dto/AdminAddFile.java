package com.example.androidnews.entity.dto;

import lombok.Data;

@Data
public class AdminAddFile {

    /**
     * 添加的文件名
     */
    private String filename;

    /**
     * 添加的文件路径
     */
    private String filePath;

    /**
     * 添加文件的类型
     */
    private String fileType;
}
