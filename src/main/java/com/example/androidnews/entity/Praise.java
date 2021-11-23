package com.example.androidnews.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zcl
 * @since 2021-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Praise implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 点赞编号
     */
    @TableId("id")
    private String id;

    /**
     * 点赞评论
     */
    private String comment;

    /**
     * 点赞者
     */
    private String user;

    /**
     * 是否删除
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 更新时间
     */
    private LocalDateTime gmtUpdate;


}
