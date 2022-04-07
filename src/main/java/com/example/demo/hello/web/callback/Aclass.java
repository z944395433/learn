package com.example.demo.hello.web.callback;

public class Aclass {

    public static ACallBack ac;

    /**
     * 调用B中的方法
     * @param str
     */
    public void methodA(){
        Bclass b = new Bclass();
        System.out.println("调用了A类中的A方法");
        ac = new ACallBack();
        b.methodA(ac);
    }


    public static class ACallBack implements CallBack{
        @Override
        public void invoke() {
            System.out.println("调用了A类中回调类的invoke方法");
        }

    }
}
