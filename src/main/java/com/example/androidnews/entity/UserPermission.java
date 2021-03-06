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
public class UserPermission implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    @TableId("id")
    private String id;

    /**
     * 角色
     */
    private String permission;

    public UserPermission() {
    }

    public UserPermission(String id, String permission) {
        this.id = id;
        this.permission = permission;
    }
}
