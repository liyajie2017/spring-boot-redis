package com.lyj.springbootredis.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: TODO
 * @author: lyj
 * @date: 2020/8/31 11:02
 * @version: v1.0
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 6729899625220690680L;

    private String id;

    private String name;
}
