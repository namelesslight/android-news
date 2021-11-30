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

    /**
     * 获取类别
     * @return java.util.list.List
     */
    public List<Category> listCategory();

    /**
     * 修改类别
     * @param categoryId 类别编号
     * @param name 类别名
     * @return java.lang.Boolean
     */
    public Boolean updateCategory(String categoryId, String name);

    /**
     * 删除类别
     * @param categoryId 类别编号
     * @return java.lang.Boolean
     */
    public Boolean deleteCategory(String categoryId);

    /**
     * 添加类别
     * @param categoryId 类别编号
     * @param categoryName 类别名
     * @return java.lang.Boolean
     */
    public Boolean insertCategory(String categoryId,String categoryName);

}
