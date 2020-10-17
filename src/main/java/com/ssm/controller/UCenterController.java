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

    /**
     * 登录，处理登录之后的信息
     * 与login.jsp页面中表单提交一致
     *
     * @return
     */
    @RequestMapping("/doLogin.do")
    public ModelAndView login(String uname, String password) {
        //1、调用业务处理的登录方法
        UCenter u1= uCenterService.login(uname, password);
        //2、根据返回结果进行判断处理
        if(u1!=null){
            //3、成功-去图书列表页面
            return new ModelAndView("booklist.do");
        }
        //失败-去登录页面并且带消息提示
        return new ModelAndView("login","msg","用户名或密码错误！");
    }
}
