package com.Jeeyse.InnerClass;

public class SafyDemo {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        SafyThread run = new SafyThread();
        //创建Thread类的对象,并传递Runnable接口的实现类对象
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        //调用start方法,开启多线程
        t1.start();
        t2.start();
        t3.start();


    }
}
