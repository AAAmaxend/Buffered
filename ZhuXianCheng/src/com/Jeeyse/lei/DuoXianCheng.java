package com.Jeeyse.lei;

/*
    创建多线程程序的第一个方法: 创建Thread类的子类,继承Thread类

      实现步骤:
       1.创建一个Thread类的子类
       2.在Thread类的子类中 重写Thread类的run(),设置线程任务 (就是线程要干什么)
       3.(在main方法中)创建Thread类的子类对象
       4.调用Thread类中的方法start()方法,开启新的线程,执行run();
          void start() 这个语句使 该线程开始执行;JVM调用该线程的 run方法
          ,但是它的结果是并发运行:当前线程start方法和另一个线程run方法
          ***多次启动一个线程是非法的***

 */
public class DuoXianCheng {
    public static void main(String[] args) {
        //3.(在main方法中)创建Thread类的子类对象
        MyThread mt = new MyThread();
        //4.调用Thread类中的方法start()方法,开启新的线程,执行run();
        mt.start();
        new MyThread().start();

//        System.out.println(Thread.currentThread().getName());   //方法3.链式编程,获取当前正在执行的线程名称
    }


}
