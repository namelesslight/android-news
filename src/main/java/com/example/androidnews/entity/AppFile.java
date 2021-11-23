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
public class AppFile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件编号
     */
    @TableId("id")
    private String id;
    /**
     * 图片或视频名称
     */
    private String name;

    /**
     * 图片或视频路径
     */
    private String path;

    private String type;

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
