package com.example.androidnews.mapper;

import com.example.androidnews.entity.Praise;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
@Repository
public interface PraiseMapper extends BaseMapper<Praise> {

    /**
     * 通过评论获取点赞个数
     * @param CommentId 评论编号
     * @return java.lang.Integer
     */
    public Integer getCountByComment(String CommentId);

    /**
     * 添加点赞
     * @param praiseId 点赞编号
     * @param commentId 点赞评论
     * @param username 用户名
     * @return java.lang.Integer
     */
    public Integer addPraise(String praiseId,String commentId,String username);

    /**
     * 根据编号删除点赞
     * @param praiseId 点赞评论
     * @return java.lang.Integer
     */
    public Integer deletePraise(String praiseId);

}
