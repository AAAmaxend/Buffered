package com.Jeeyse.SolveThread;
/*
    Lock锁也叫同步锁,加锁和 释放锁方法化
      public void lock():加同步锁
      public void unlock():释放 同步锁
    使用步骤:
       1.在成员位置创建一个ReentranLock对象
       2.在可能会出现线程安全问题的代码前调用lock接口的方法获取锁
       3.在可能会出现线程安全问题的代码后调用unlock接口的方法释放锁

 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Solu3Thread implements Runnable {
    private int ticket = 100;
    //
    Lock l = new ReentrantLock() ;


    @Override
    public void run() {
        while(true){
            l.lock();
            if (ticket > 0){
                try {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName()+"正在售出第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    l.unlock();
                }

            }
        }

    }
}

