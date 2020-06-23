package com.Jeeyse.SolveThread;
/*
       解决线程安全问题------方法二 :同步方法
       同步方法: 使用synchronized修饰的方法,就叫做同步方法. 保证A线程执行该方法时,其他线程只能在方法外等着
       格   式: 修饰符 synchronized 返回值类型 方法名(参数列表){
                   可能出现线程安全的代码/访问共享数据的代码
                  }
       使用步骤:
          1.把访问共享数据抽取出来,放到一个方法中
          2.在方法上添加synchronized
       同步方法的锁对象是谁?
          就是实现类对象new Solu2Thread();,也就是this

 */
public class Solu2Thread implements Runnable {

    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            payTicket();
        }
    }


    //定义一个同步方法
        public /*synchronized */void payTicket() {
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在售出第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }

