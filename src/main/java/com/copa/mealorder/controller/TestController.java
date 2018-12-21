package com.copa.mealorder.controller;

import com.copa.mealorder.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 12.21
 * 测试controller
 */

@Controller
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping("/test")
    public String testController(Model model){
        model.addAttribute("test",service.testSerivce());
        return "test";
    }
}
