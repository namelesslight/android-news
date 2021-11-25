package com.example.androidnews.entity;

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
 * @since 2021-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 角色编号
     */
    @TableId("id")
    private Integer id;

    /**
     * 角色
     */
    private String role;


}
