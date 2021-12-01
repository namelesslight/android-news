package com.example.androidnews.service;

import com.example.androidnews.entity.Comment;
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
public interface ICommentService extends IService<Comment> {

    /**
     * 根据新闻编号和评论父类查询评论
     * @param newsId 新闻编号
     * @param commentFather 评论父类
     * @return java.util.List
     */
    public List<Comment>  listComment(String newsId,String commentFather);

    /**
     * 添加评论
     * @param commentId 评论编号
     * @param father 评论父类
     * @param username 评论用户
     * @param content 评论内容
     * @param news 评论新闻
     * @return java.lang.Boolean
     */
    public Boolean addComment(String commentId,String father,String username, String content, String news);

    /**
     * 评论
     * @param commentId 评论编号
     * @return java.lang.Boolean
     */
    public Boolean deleteComment(String commentId);

}
