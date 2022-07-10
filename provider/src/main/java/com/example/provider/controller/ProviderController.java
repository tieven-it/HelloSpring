package com.example.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 2.3 创建控制类

@RequestMapping("provider")
@RestController
public class ProviderController {

    @RequestMapping("getName")
    public String getName(){
        System.out.println("[Provider]->getName()");
        return "Hello Spring!";
    }
}
