package com.example.demo.hello.web.learn.day1;

public class Annimal implements CatService{

    private final CatService cat;

    public Annimal(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String say(){
        System.out.println("切入对象开始");
        cat.say();
        System.out.println("切入对象结束");
        return "ao ao ao";
    }
}
