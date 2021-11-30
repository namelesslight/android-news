package com.example.androidnews.mapper;

import com.example.androidnews.entity.Category;
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
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * 查询所有类别
     * @return java.util.List
     */
    public List<Category> listCategory();

    /**
     * 通过编号修改类别
     * @param categoryId 类别编号
     * @param categoryName 类别名
     * @return java.lang.Integer
     */
    public Integer updateCategoryById(String categoryId,String categoryName);

    /**
     * 通过编号删除类别
     * @param categoryId 类别编号
     * @return java.lang.Integer
     */
    public Integer deleteCategoryById(String categoryId);

    /**
     * 添加类别
     * @param categoryId 类别编号
     * @param categoryName 类别名
     * @return java.lang.Integer
     */
    public Integer insertCategory(String categoryId,String categoryName);

}
