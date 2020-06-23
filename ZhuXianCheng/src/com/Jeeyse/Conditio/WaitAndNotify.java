package com.Jeeyse.Conditio;

/*
    等待/唤醒 案例代码:线程通信
       创建一个顾客线程(消费者):告知生产者要的商品的种类和数量,就得先调用wait()方法,主动放弃cpu的执行,进入waiting状态
       创建一个老板线程(生产者):花了多久做好,做好就得调用notify()方法,唤醒顾客带走商品
    注意:
       1.顾客和老板线程必须使用同步技术包裹起来,以保证等待和唤醒只能有一个执行
       2.两个线程同步使用的锁对象必须唯一
       3.只有锁对象才能调用 Object类中的wait和 notify方法

 */
public class WaitAndNotify {
    public static void main(String[] args) {
        //注意 2.两个线程同步使用的锁对象必须唯一
        //创建一个锁对象,保证唯一
        Object obj = new Object();
        //创建一个顾客线程(消费者),使用匿名内部类(优点是代码简单)
        new Thread(){
            @Override
            public void run() {
                while (true) {   //while(true)  死循环
                    // 注意 1.顾客和老板线程必须使用同步技术包裹起来,以保证等待和唤醒只能有一个执行
                    synchronized (obj) {
                        System.out.println("告诉生产者需要商品的种类和数量");

                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("商品出炉了,顾客终于可以开吃了");
                        System.out.println("--------------------------------------");
                    }
                }
            }
        }.start();

        //创建一个老板线程(生产者),使用匿名内部类
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //注意 1.顾客和老板线程必须使用同步技术包裹起来,以保证等待和唤醒只能有一个执行
                    synchronized (obj) {
                        System.out.println("老板3秒后做好,告知顾客可以准备来带走");
                        //得有 notify方法才能回到消费者线程,进行通信
                        obj.notify();
                    }
                }
            }
        }.start();



    }

}
