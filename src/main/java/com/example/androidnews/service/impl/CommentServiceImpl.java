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
}
