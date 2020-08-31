package com.lyj.springbootredis.service.impl;

import com.lyj.springbootredis.bean.User;
import com.lyj.springbootredis.service.UserService;
import com.lyj.springbootredis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: lyj
 * @date: 2020/8/31 11:13
 * @version: v1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public boolean saveUser(User user) {
        return redisUtil.set("user",user);
    }

    @Override
    public User getUserById(String id) {
        User user = (User)redisUtil.get(id);
        return user;
    }

    @Override
    public boolean updateUser(User user) {
        return redisUtil.set("user",user);
    }

    @Override
    public void deleteUserById(String id) {
        redisUtil.del(id);
    }
}
