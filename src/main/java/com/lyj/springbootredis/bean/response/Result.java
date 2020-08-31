package com.lyj.springbootredis.bean.response;

import lombok.Data;

/**
 * @description: 接口统一返回
 * @author: lyj
 * @date: 2020/8/31 16:44
 * @version: v1.0
 */
@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;
}
