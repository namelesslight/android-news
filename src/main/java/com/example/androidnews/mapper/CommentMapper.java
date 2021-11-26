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
    public List<Comment> listComment(String newsId, String commentFather);
}
