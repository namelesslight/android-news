package com.example.androidnews.service.impl;

import com.example.androidnews.entity.AppFile;
import com.example.androidnews.mapper.AppFileMapper;
import com.example.androidnews.service.IAppFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
@Service
public class AppFileServiceImpl extends ServiceImpl<AppFileMapper, AppFile> implements IAppFileService {

    @Resource
    AppFileMapper appFileMapper;

    @Override
    public Boolean deleteFile(String fileId) {
        return appFileMapper.deleteFileById(fileId) == 1;
    }

    @Override
    public Boolean insertFile(String fileId, String fileName, String filePath,String fileType) {
        return appFileMapper.insertFile(fileId,fileName,filePath,fileType) == 1;
    }
}
