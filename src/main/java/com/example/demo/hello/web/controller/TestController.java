package com.example.demo.hello.web.controller;

import com.example.demo.hello.web.service.TestService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
@AllArgsConstructor
public class TestController {

    private final TestService testService;



    @RequestMapping("world")
    public String hello(){
        return testService.hello();
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tx.xml");
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//        t1.setName("t1");
//        t2.setName("t2");
//        t2.start();
//        t1.start();
//        ImplThread impl = new ImplThread();
//        new Thread(impl,"t1").start();
//        new Thread(impl,"t2").start();

    }
}

class MyThread extends Thread {
    //
    private  static Integer ticket = 100;
    static Object object = new Object();

    @SneakyThrows
    @Override
    public void run() {

        while (ticket >= 1) {
            synchronized (object) {
                if (ticket >= 1) {
                    Thread.sleep(1000);
                    ticket--;
                    System.out.println("线程：" + Thread.currentThread().getId() + "; 当前票数" + ticket);
                } else {
                    System.out.println("卖完了！当前票数:" + ticket);
                    //分析为什么会出现死循环
                    //break;
                }
            }
        }
    }
}

class ImplThread implements Runnable{
    private Integer ticket = 100;

    @SneakyThrows
    @Override
    public void run() {
        while (ticket >= 1) {
            synchronized (this) {
                Thread.sleep(1000);
                if (ticket >= 1) {
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+";票还剩余："+ticket);
                } else {
                    System.out.println(Thread.currentThread().getName()+";票卖完来，票还剩余："+ticket);
                }
            }
        }
    }
}
