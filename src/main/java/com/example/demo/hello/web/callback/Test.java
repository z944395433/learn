package com.example.demo.hello.web.callback;

public class Test {
    public static void main(String[] args) {
//        Aclass a =new Aclass();
//        a.methodA();

        String s = new String("1");
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        String s4 = "11";
        System.out.println(s3 == s4);
    }
}
