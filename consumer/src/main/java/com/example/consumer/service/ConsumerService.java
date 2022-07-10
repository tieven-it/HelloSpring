package com.example.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// 3.3 业务层：使用FeignClient调用服务
// 3.4 注册子模块名称
@FeignClient(value = "service-provider")
public interface ConsumerService {

    // 3.5 接口访问地址
    @RequestMapping("/provider/getName")
    String getName();
}
