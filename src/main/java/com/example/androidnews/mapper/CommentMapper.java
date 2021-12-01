package com.example.androidnews.mapper;

import com.example.androidnews.entity.Comment;
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
public interface CommentMapper extends BaseMapper<Comment> {

    /**
     * 根据父类和新闻查询评论
     * @param newsId 新闻编号
     * @param commentFather 评论父类
     * @return java.util.List
     */
    public List<Comment> listComment(String newsId, String commentFather);

    /**
     * 添加评论
     * @param commentId 评论编号
     * @param father 评论父类
     * @param username 评论用户
     * @param content 评论内容
     * @param news 评论新闻
     * @return java.lang.Integer
     */
    public Integer addComment(String commentId,String father,String username, String content, String news);

    /**
     * 删除评论
     * @param commentId 评论编号
     * @return java.lang.Integer
     */
    public Integer deleteComment(String commentId);

}
