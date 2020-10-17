package com.ssm.dao;

import com.ssm.entity.UCenter;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Celery
 */
public interface UCenterMapper {
    /**
     * 登录
     * 两个参数以上需要写上注解
     *
     * @param uname
     * @param password
     * @return
     */
    @Select("select * from ucenter where uname=#{uname} and password=#{password}")
    UCenter login(@Param("uname") String uname, @Param("password") String password);
}
