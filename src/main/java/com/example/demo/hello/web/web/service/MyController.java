package com.example.demo.hello.web.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class MyController {
    @Zhuru
    private MyService myService;

    @Value("${he}")
    private  String he;

    public MyService getMyService() {
        return myService;
    }

    public void setMyService(MyService myService) {
        this.myService = myService;
    }
}
