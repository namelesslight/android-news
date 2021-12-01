package com.example.androidnews.service;

import com.example.androidnews.entity.Praise;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
public interface IPraiseService extends IService<Praise> {

    /**
     * 通过评论获取点赞数
     * @param commentId 评论编号
     * @return java.lang.Integer
     */
    public Integer getCountByComment(String commentId);

    /**
     * 添加点赞
     * @param praiseId 点赞编号
     * @param commentId 点赞评论
     * @param username 用户名
     * @return java.lang.Boolean
     */
    public Boolean addPraise(String praiseId,String commentId,String username);

    /**
     * 根据编号删除点赞
     * @param praiseId 点赞评论
     * @return java.lang.Boolean
     */
    public Boolean deletePraise(String praiseId);
}
