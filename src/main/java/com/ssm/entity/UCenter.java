package com.ssm.entity;

import lombok.Data;

/**
 * @author Celery
 * @Des: 用户类
 */
@Data
public class UCenter {
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 用户名
     */
    private String uname;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户年龄
     */
    private Integer age;
    /**
     * 用户性别
     */
    private Integer sex;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 用户类型：0表示普通用户，1表示管理员
     */
    private Integer usertype;
}
