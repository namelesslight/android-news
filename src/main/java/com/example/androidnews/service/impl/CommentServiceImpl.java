package com.example.androidnews.service.impl;

import com.example.androidnews.entity.Comment;
import com.example.androidnews.mapper.CommentMapper;
import com.example.androidnews.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

    @Resource
    CommentMapper commentMapper;

    /**
     * 查询符合条件的新闻
     * @param newsId 新闻编号
     * @param commentFather 评论父类
     * @return
     */
    @Override
    public List<Comment> listComment(String newsId, String commentFather) {
        return commentMapper.listComment(newsId,commentFather);
    }

    /**
     * 添加评论
     * @param commentId 评论编号
     * @param father 评论父类
     * @param username 评论用户
     * @param content 评论内容
     * @param news 评论新闻
     * @return java.lang.Boolean
     */
    @Override
    public Boolean addComment(String commentId, String father, String username, String content, String news) {
        return commentMapper.addComment(commentId,father,username,content,news) == 1;
    }

    /**
     * 删除评论
     * @param commentId 评论编号
     * @return java.lang.Boolean
     */
    @Override
    public Boolean deleteComment(String commentId) {
        return commentMapper.deleteComment(commentId) == 1;
    }
}
