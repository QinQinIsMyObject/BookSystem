package com.ssm.controller;

import com.ssm.entity.UCenter;
import com.ssm.service.UCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Celery
 */
@Controller
public class UCenterController {
    /**
     * 控制层调用业务层
     */
    @Autowired
    private UCenterService uCenterService;

    /**
     * 去登录页面
     *
     * @return
     */
    @RequestMapping("/toLogin.do")
    public String toLoginPage() {
        // 去登录页面-逻辑视图名
        return "login";
    }

}
