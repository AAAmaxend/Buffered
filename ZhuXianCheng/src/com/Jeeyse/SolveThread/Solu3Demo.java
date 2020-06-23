package com.Jeeyse.SolveThread;

public class Solu3Demo {
    public static void main(String[] args) {
        //步骤3.创建一个Runnable接口的实现类
        Solu3Thread solu3 = new Solu3Thread();
        //步骤4.创建Thread类的对象,构造方法并传递 Runnable接口的实现类
        Thread t1 = new Thread(solu3);
        Thread t2= new Thread(solu3);
        Thread t3= new Thread(solu3);
        //步骤5.调用start方法,开启线程执行
        t1.start();
        t2.start();
        t3.start();
    }
    }

