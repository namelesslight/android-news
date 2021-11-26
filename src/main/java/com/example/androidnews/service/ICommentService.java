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
    public List<Comment>  listComment(String newsId,String commentFather);
}
