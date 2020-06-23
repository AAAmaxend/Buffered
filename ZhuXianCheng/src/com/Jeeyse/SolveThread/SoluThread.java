package com.Jeeyse.SolveThread;
/*
    解决线程安全问题------方法一:线程同步 同步代码块
    同步代码块:synochronized关键字可用于方法中的某个区块中,表示只对这个区块的资源 实行互斥访问
    格     式:synochronized(锁对象){
                 可能出现线程安全问题的代码/访问共享数据的代码
                 }
    锁   对象:同步代码块中的锁对象 可以使用任意的对象,
              但是必须保证多线程 使用的对象锁为同一个;
              它的作用: 把同步代码块锁住,只让一个线程在同步代码块执行

 */

//步骤1.创建一个Runnable接口的实现类
public class SoluThread implements Runnable{
    private int ticket = 100;
    //创建锁对象
    Object obj = new Object();
    //步骤2.重写run方法,设置线程任务
    @Override
    public void run() {
        while (true){
            //同步代码块synochronized关键字
            synchronized (obj){
                if(ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在售出第"+ticket+"张票");
                    ticket--;
                }
            }
        }
    }
}
