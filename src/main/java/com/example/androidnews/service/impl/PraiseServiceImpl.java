package com.example.androidnews.service.impl;

import com.example.androidnews.entity.Praise;
import com.example.androidnews.mapper.PraiseMapper;
import com.example.androidnews.service.IPraiseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
@Service
public class PraiseServiceImpl extends ServiceImpl<PraiseMapper, Praise> implements IPraiseService {

    @Resource
    PraiseMapper praiseMapper;

    /**
     * 通过评论获取点赞数
     * @param commentId 评论编号
     * @return java.lang.Integer
     */
    @Override
    public Integer getCountByComment(String commentId) {
        return praiseMapper.getCountByComment(commentId);
    }

    /**
     * 添加点赞
     * @param praiseId 点赞编号
     * @param commentId 点赞评论
     * @param username 用户名
     * @return java.lang.Integer
     */
    @Override
    public Boolean addPraise(String praiseId, String commentId, String username) {
        return praiseMapper.addPraise(praiseId,commentId,username) == 1;
    }

    /**
     * 删除点赞
     * @param praiseId 点赞评论
     * @return java.lang.Integer
     */
    @Override
    public Boolean deletePraise(String praiseId) {
        return praiseMapper.deletePraise(praiseId) == 1;
    }
}
