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

}
