package com.Jeeyse.Runnable;

/*
   创建新执行线程的第二种方法: 声明实现Runnable接口的类,重写run方法
   步骤:
     1.创建一个Runnable接口的实现类
     2.在实现类中重写Runnable接口的run方法,设置线程任务
     3.创建一个Runnable接口的实现对象
     4.创建Thread类对象,在构造方法中传递Runnable接口的实现类对象
     5.调用Thread类中的start方法,开启的先测会给你执行run方法
 */
//步骤1.创建一个Runnable接口的实现
public class RunnableImpl implements Runnable{
    //步骤2.重写run方法,设置线程任务
    @Override
    public void run() {
        //具体任务
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}
