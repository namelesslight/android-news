package com.example.androidnews.service;

import com.example.androidnews.entity.Category;
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
public interface ICategoryService extends IService<Category> {

    public List<Category> listCategory();

}
