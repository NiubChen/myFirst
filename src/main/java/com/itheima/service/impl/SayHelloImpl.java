package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.HelloService;

@Service
public class SayHelloImpl implements HelloService {

    public String sayHello(String name) {

        return name+"success";
    }
}
