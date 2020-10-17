package com.ssm.service.impl;

import com.ssm.dao.UCenterMapper;
import com.ssm.entity.UCenter;
import com.ssm.service.UCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Celery
 * 业务层
 */
@Service
public class UCenterServiceImpl implements UCenterService {
    /**
     * 业务层调用dao层
     */
    @Autowired
    private UCenterMapper uCenterMapper;

    /**
     * 登录
     *
     * @param uname
     * @param password
     * @return
     */
    @Override
    public UCenter login(String uname, String password) {
        return uCenterMapper.login(uname, password);
    }
}
