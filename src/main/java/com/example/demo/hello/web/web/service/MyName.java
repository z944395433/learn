package com.example.demo.hello.web.web.service;

import java.lang.annotation.Annotation;
import java.util.stream.Stream;

public class MyName {
    public static void main(String[] args) {
        //三种获取class对象
//        Class.forName("xxxxx");
//        new MyController().getClass();
//        MyController.class;


        MyController myController = new MyController();
        Class<? extends MyController> clazz = myController.getClass();
        Stream.of(clazz.getDeclaredFields()).forEach(field -> {
            try {
                Object obj = field.getType().newInstance();
                Zhuru zhuru = field.getDeclaredAnnotation(Zhuru.class);
                if (zhuru != null) {
                    field.setAccessible(true);
                    field.set(myController,obj);
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        System.out.println(myController.getMyService());

    }
}
