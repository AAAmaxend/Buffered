package com.Jeeyse.Runnable;

public class Run {
    public static void main(String[] args) {
        //步骤3.创建一个Runnable接口的实现类对象(就是谁接口Runnable,谁就是实现类)
        RunnableImpl r = new RunnableImpl();
        //4.创建Thread类的对象,传递 Runnable接口的实现类对象
        Thread t = new Thread(r);
        //5.调用Thread类中的Start方法,开启新线程 run方法中的任务执行
        t.start();

        Thread th = new Thread(new RunnableImpl());
        th.start();


        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}
