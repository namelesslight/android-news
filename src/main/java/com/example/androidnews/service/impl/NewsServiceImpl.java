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
}
