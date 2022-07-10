package com.example.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

// 3.3 业务层：使用RestTemplate调用服务
@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    public String getName(){
        return restTemplate.getForObject("http://service-provider/provider/getName",String.class);
    }
}
