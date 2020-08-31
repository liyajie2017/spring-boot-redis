package com.lyj.springbootredis.util;

import com.lyj.springbootredis.bean.response.Result;
import org.springframework.stereotype.Component;

/**
 * @description: TODO
 * @author: lyj
 * @date: 2020/8/31 16:47
 * @version: v1.0
 */
@Component
public class ResponseUtil {
    //请求成功
    public Result success(Object data){
        Result result = new Result();
        result.setCode(200);
        result.setMsg("请求成功");
        result.setData(data);
        return result;
    }

    //请求失败
    public Result fail(Object data){
        Result result = new Result();
        result.setCode(500);
        result.setMsg("请求失败");
        result.setData(data);
        return result;
    }
}
