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
     * @return
     */
    @Override
    public List<Category> listCategory() {
        return categoryMapper.listCategory();
    }
}
