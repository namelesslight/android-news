package com.example.androidnews.service;

import com.example.androidnews.entity.News;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
public interface INewsService extends IService<News> {

    /**
     * 通过类别查询行为
     * @param categoryId 类别编号
     * @return java.util.List
     */
    public List<News> listByCategory(String categoryId);

    /**
     * 查询所有新闻
     * @return java.util.List
     */
    public List<News> listNews();

    /**
     * 搜索到的新闻结果
     * @param keyWord 关键字
     * @return java.util.List
     */
    public List<News> findNews(String keyWord);

    /**
     * 添加新闻
     * @param title 新闻标题
     * @param content 新闻内容
     * @param file 新闻文件
     * @param category 新闻类别
     * @param type 新闻类型
     * @return java.lang.Boolean
     */
    public Boolean insertNews(String newsId,String title, String content, String file, String category, String type);

    /**
     * 修改新闻
     * @param newsId 新闻编号
     * @param title 新闻标题
     * @param content 新闻内容
     * @param file 新闻文件
     * @param category 新闻类别
     * @param type 新闻类型
     * @return java.lang.Boolean
     */
    public Boolean updateNews(String newsId, String title, String content, String file, String category, String type);

    /**
     * 删除新闻
     * @param newsId 新闻标题
     * @return java.lang.Boolean
     */
    public Boolean deleteNews(String newsId);
}
