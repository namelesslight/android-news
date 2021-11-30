package com.example.androidnews.service;

import com.example.androidnews.entity.AppFile;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
public interface IAppFileService extends IService<AppFile> {

    /**
     * 删除文件
     * @param fileId 文件编号
     * @return
     */
    public Boolean deleteFile(String fileId);

    /**
     * 添加文件
     * @param fileId 文件编号
     * @param fileName 文件名
     * @param filePath 文件路径
     * @param fileType 文件类型
     * @return java.lang.Boolean
     */
    public Boolean insertFile(String fileId,String fileName,String filePath,String fileType);
}
