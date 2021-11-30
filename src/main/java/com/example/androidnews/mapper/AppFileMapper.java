package com.example.androidnews.mapper;

import com.example.androidnews.entity.AppFile;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
@Repository
public interface AppFileMapper extends BaseMapper<AppFile> {

    /**
     * 通过编号删除文件
     * @param fileId 文件编号
     * @return java.lang.Integer
     */
    public Integer deleteFileById(String fileId);

    /**
     * 添加文件
     * @param fileId 文件编号
     * @param fileName 文件名
     * @param filePath 文件路径
     * @return java.lang.Integer
     */
    public Integer insertFile(String fileId, String fileName, String filePath,String fileType);

}
