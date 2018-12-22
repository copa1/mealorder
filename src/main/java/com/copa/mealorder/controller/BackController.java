package com.copa.mealorder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 12.22
 * 所有页面跳转
 */

@Controller
public class BackController {

    //打开登录页面
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }


}
