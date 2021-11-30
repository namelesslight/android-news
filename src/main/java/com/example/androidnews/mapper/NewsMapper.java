package com.example.androidnews.mapper;

import com.example.androidnews.entity.News;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
@Repository
public interface NewsMapper extends BaseMapper<News> {

    /**
     * 获取id等于Category的新闻数据
     * @param categoryId cateory的id
     * @return java.util.List
     */
    public List<News> listByCategory(String categoryId);

    /**
     * 获取全部的新闻数据
     * @return
     */
    public List<News> listNews();

    /**
     * 通过关键字搜索可能相关的新闻数据
     * @param keyWord 关键字
     * @return
     */
    public List<News> findNews(String keyWord);

    /**
     * 添加新闻
     * @param title 新闻标题
     * @param content 新闻内容
     * @param file 新闻文件
     * @param category 新闻类别
     * @param type 新闻类型
     * @return java.lang.Integer
     */
    public Integer insertNews(String newsId,String title, String content, String file, String category, String type);

    /**
     * 修改新闻
     * @param newsId 新闻编号
     * @param title 新闻标题
     * @param content 新闻内容
     * @param file 新闻文件
     * @param category 新闻类别
     * @param type 新闻类型
     * @return java.lang.Integer
     */
    public Integer updateNews(String newsId, String title, String content, String file, String category, String type);

    /**
     * 删除新闻
     * @param newsId 新闻编号
     * @return java.lang.Integer
     */
    public Integer deleteNewsById(String newsId);
}
