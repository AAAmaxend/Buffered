package com.Jeeyse02.ThreadPool;
/*
  注意:
      1.包子铺线程和包子线程的关系是:通信关系--互斥关系
      2.必须使用同步技术保证两个线程只能有一个执行
      3.包子铺线程和吃货线程锁对象必须保证唯一
      4.包子铺线程和吃货线程需要把包子对象作为参数传递进来
        a.需要再成员位置创建一个包子变量
        b.使用带参构造方法,为这个包子变量赋值

 */
/*
       老板类(生产者):是一个线程类,继承Thread
          其线程任务(run):生产包子
            对包子的状态进行判断:若有true,则....
                                若无false,则....

 */
public class BaoZiPu extends Thread{
    //4.包子铺线程和吃货线程需要把包子对象作为参数传递进来
    // a.需要再成员位置创建一个包子变量
    private BaoZi bz;
    //4.包子铺线程和吃货线程需要把包子对象作为参数传递进来
    // b.使用带参构造方法,为这个包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }
    //设置线程任务,重写run方法
    @Override
    public void run() {
        //同步技术 2.必须使用同步技术保证两个线程只能有一个执行
        synchronized (bz){
            //判断包子的状态
            if (bz.flag==true){
                try {
                    bz.wait() ;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            bz.pi="薄皮";
            bz.xian="腌菜" ;
            System.out.println("包子铺正在生产"+bz.pi+bz.xian+"的包子");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bz.flag=true;
            bz.notify() ;
            System.out.println("包子铺已经做好了"+bz.pi+bz.xian +"的包子");

        }
    }
}
