package com.example.demo.hello.web.learn.day1;

public class Cat implements CatService{


    @Override
    public String say() {
        System.out.println("miao miao");
        return "miaomiao";
    }
}
