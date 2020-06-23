package com.Jeeyse.SolveThread;

public class SoluDemo {
    public static void main(String[] args) {
        //步骤3.创建一个Runnable接口的实现类
        SoluThread solu = new SoluThread();
        //步骤4.创建Thread类的对象,构造方法并传递 Runnable接口的实现类
        Thread t1 = new Thread(solu);
        Thread t2= new Thread(solu);
        Thread t3= new Thread(solu);
        //步骤5.调用start方法,开启线程执行
        t1.start();
        t2.start();
        t3.start();


    }


}
