package com.example.demo.hello.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.hello.web.model.Test;

public interface TestService extends IService<Test> {
    String hello();
}
