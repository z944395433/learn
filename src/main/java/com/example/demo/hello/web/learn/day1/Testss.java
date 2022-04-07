package com.example.demo.hello.web.learn.day1;

public class Testss {
    public static void main(String[] args) {
        //静态代理
        // 实现一个接口，建立一个代理类去实现接口，在代理内中执行这个对象
        Cat cat = new Cat();
        Annimal annimal = new Annimal(cat);
        annimal.say();
        //动态代理JDK实现代理只需要使用  必须代理接口 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理 newProxyInstance
        CatService cat1 = new Cat();
        ProxyFactory proxyFactory = new ProxyFactory(cat1);
        CatService proxy =(CatService) proxyFactory.getProxyInstance();
        proxy.say();
        // Cglib代理 ,目标类不用实现接口
        //https://www.cnblogs.com/cenyu/p/6289209.html
    }
}
