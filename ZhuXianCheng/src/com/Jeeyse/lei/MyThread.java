package com.Jeeyse.lei;

//1.创建一个Thread类的子类
public class MyThread extends Thread{
//     //2.在Thread类的子类中 重写Thread类的run(),目的是:设置线程任务 (就是线程要干什么)
//    @Override
//    public void run() {
//      for (int i=0 ; i < 20 ; i++){
//          System.out.println("run"+i+"次");
//      }
//
//    }

//2.在Thread类的子类中 重写Thread类的run(),目的是:设置线程任务 (就是线程要干什么)
    @Override
    /*
       获取线程名称的方法有3种:
          方法1.直接使用Thread类中的方法getName方法
          方法2.先获取正在执行的线程,再使用线程中的getName方法
          方法3.链式编程,获取当前正在执行的线程名称
     */
    public void run() {
//        String name = getName();  //方法1.直接使用Thread类中的方法getName方法
//        System.out.println(name);

//        Thread t = Thread.currentThread(); //方法2.先获取正在执行的线程,再使用线程中的getName方法
//        String name = t.getName();
//        System.out.println(name);





    }
}
