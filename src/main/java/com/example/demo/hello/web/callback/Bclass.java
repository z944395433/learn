package com.example.demo.hello.web.callback;

public class Bclass {

    public void methodA(Aclass.ACallBack back){
        System.out.println("调用方法B-》A");
        back.invoke();
    }
}
