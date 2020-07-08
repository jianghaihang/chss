package com.neusoft.CHSS.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 微信小程序
 * @time 2020/3/29 16:10
 */
@RestController
@RequestMapping("/applets")
public class WxAppletsControler {

    @RequestMapping("customer")
    public void acceptCustomer(){

    }
}
