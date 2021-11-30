package com.example.androidnews.service.impl;

import com.example.androidnews.entity.News;
import com.example.androidnews.mapper.NewsMapper;
import com.example.androidnews.service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

    @Resource
    NewsMapper newsMapper;

    /**
     * @param categoryId category的id
     * @return java.util.List
     */
    @Override
    public List<News> listByCategory(String categoryId) {
        return newsMapper.listByCategory(categoryId);
    }

    /**
     * 获取全部新闻
     * @return java.util.List
     */
    @Override
    public List<News> listNews() {
        return newsMapper.listNews();
    }

    /**
     * 通过关键字搜索新闻
     * @param keyWord 关键字
     * @return java.util.List
     */
    @Override
    public List<News> findNews(String keyWord) {
        return newsMapper.findNews(keyWord);
    }

    /**
     * 添加新闻
     * @param title 新闻标题
     * @param content 新闻内容
     * @param file 新闻文件
     * @param category 新闻类别
     * @param type 新闻类型
     * @return java.lang.Boolean
     */
    @Override
    public Boolean insertNews(String newsId,String title, String content, String file, String category, String type) {
        return newsMapper.insertNews(newsId,title,content,file,category,type) == 1;
    }

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
    @Override
    public Boolean updateNews(String newsId, String title, String content, String file, String category, String type) {
        return newsMapper.updateNews(newsId,title,content,file,category,type) == 1;
    }

    /**
     * 删除新闻
     * @param newsId 新闻标题
     * @return java.lang.Boolean
     */
    @Override
    public Boolean deleteNews(String newsId) {
        return newsMapper.deleteNewsById(newsId) == 1;
    }
}
