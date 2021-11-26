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
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    @TableId("id")
    private String id;

    /**
     * 角色
     */
    private String role;

    public UserRole() {
    }

    public UserRole(String id, String role) {
        this.id = id;
        this.role = role;
    }
}
