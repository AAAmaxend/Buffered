package com.Jeeyse02.ThreadPool;
/*
    吃货类:也是一个线程类,继承Thread
      设置线程任务:吃包子
        对包子的状态进行判断:若false,则等待
                            若true,则...
 */
public class ChiHuo extends Thread{
    //4.包子铺线程和吃货线程需要把包子对象作为参数传递进来
    // a.需要再成员位置创建一个包子变量
    private BaoZi bz;
    //4.包子铺线程和吃货线程需要把包子对象作为参数传递进来
    // b.使用带参构造方法,为这个包子变量赋值

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        synchronized (bz){
            if (bz.flag == false){
                try {
                    bz.wait() ;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //被唤醒后的执行动作,吃包子
            System.out.println("有包子了,吃货正在吃"+bz.pi +bz.xian +"的包子");
            //吃完包子,修改包子的状态
            bz.flag =false;
            System.out.println("包子吃完了,包子铺又要开始生产包子了");
            bz.notify() ;
            System.out.println("----------------------------------");
        }
    }
}
