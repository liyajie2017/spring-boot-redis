package com.lyj.springbootredis.service;

import com.lyj.springbootredis.bean.User;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: lyj
 * @date: 2020/8/31 11:13
 * @version: v1.0
 */
public interface UserService {
    //增
    boolean saveUser(User user);

    //查询
    User getUserById(String id);

    //修改
    boolean updateUser(User user);

    //删除
    void deleteUserById(String id);
}
