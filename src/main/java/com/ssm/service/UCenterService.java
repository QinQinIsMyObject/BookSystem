package com.ssm.service;

import com.ssm.entity.UCenter;

/**
 * @author Celery
 */
public interface UCenterService {
    /**
     * 登录
     *
     * @param uname
     * @param password
     * @return
     */
    UCenter login(String uname, String password);

}
