package com.lyj.springbootredis.controller;

import com.lyj.springbootredis.bean.User;
import com.lyj.springbootredis.bean.response.Result;
import com.lyj.springbootredis.service.UserService;
import com.lyj.springbootredis.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: lyj
 * @date: 2020/8/31 11:26
 * @version: v1.0
 */
@RestController
public class UserController {

    @Autowired
    ResponseUtil responseUtil;

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public Result getUser(){
        User user = null;
        String key = "user";
        try{
            user = userService.getUserById(key);
            if(null == user){
                return responseUtil.success("根据key值：" + key + "没有查询到结果");
            }
        }catch (Exception e){
            e.printStackTrace();
            return responseUtil.fail(e.getMessage());
        }
        return responseUtil.success(user);
    }

    @GetMapping("/saveUser")
    public Result saveUser(){
        User user = null;
        try{
            user = new User();
            user.setId("1");
            user.setName("李四");
            boolean flag = userService.saveUser(user);
            if(!flag){
                return responseUtil.fail(user + "保存失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            return responseUtil.fail(e.getMessage());
        }
        return responseUtil.success(user);
    }

    @GetMapping("/updateUser")
    public Result updateUser(){
        User user = null;
        try{
            user = new User();
            user.setId("1");
            user.setName("李四");
            boolean flag = userService.updateUser(user);
            if(!flag){
                return responseUtil.fail(user+"更新失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            return responseUtil.fail(e.getMessage());
        }
        return responseUtil.success(user);
    }

    @GetMapping("/delUser")
    public Result delUser(){
        try{
            userService.deleteUserById("user");
        }catch (Exception e){
            e.printStackTrace();
            return responseUtil.fail(e.getMessage());
        }
        return responseUtil.success("");
    }
}
