package com.example.androidnews.service.impl;

import com.example.androidnews.entity.Category;
import com.example.androidnews.mapper.CategoryMapper;
import com.example.androidnews.service.ICategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

    @Resource
    CategoryMapper categoryMapper;

    /**
     * 获取类别
     * @return java.util.list.List
     */
    @Override
    public List<Category> listCategory() {
        return categoryMapper.listCategory();
    }

    /**
     * 修改类别
     * @param categoryId 类别编号
     * @param name 类别名
     * @return java.lang.Boolean
     */
    @Override
    public Boolean updateCategory(String categoryId, String name) {
        return categoryMapper.updateCategoryById(categoryId,name) == 1;
    }

    /**
     * 删除类别
     * @param categoryId 类别编号
     * @return java.lang.Boolean
     */
    @Override
    public Boolean deleteCategory(String categoryId) {
        return categoryMapper.deleteCategoryById(categoryId) == 1;
    }

    /**
     * 添加类别
     * @param categoryId 类别编号
     * @param categoryName 类别名
     * @return java.lang.Boolean
     */
    @Override
    public Boolean insertCategory(String categoryId, String categoryName) {
        return categoryMapper.insertCategory(categoryId,categoryName) == 1;
    }

}
