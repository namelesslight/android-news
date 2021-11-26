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

    public List<News> listByCategory(String categoryId);

    public List<News> listNews();

    public List<News> findNews(String keyWord);
}
