package com.example.androidnews.mapper;

import com.example.androidnews.entity.User;
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
public interface UserMapper extends BaseMapper<User> {

    public Integer getUserByUsernameCount(String username);

    public Integer getUserByNamePasswordCount(String username,String password);

    public Integer insertUser(String username,String password);

    public List<User> findUser(String userKeyWord);

    public List<User> listUser();
}
