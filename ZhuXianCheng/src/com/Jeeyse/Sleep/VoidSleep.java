package com.Jeeyse.Sleep;
/*
   public static void sleep(long millis):使当前正在执行的 线程以指定的毫秒数 暂时停止执行
   毫秒数结束后,继续进行线程执行
 */
public class VoidSleep {
    public static void main(String[] args) throws InterruptedException {
        //模拟秒表

        for (int i = 1; i <= 60; i++) {
            //模拟秒表,使用Thread类的sleep方法让程序睡眠2秒钟
            Thread.sleep(1000);
            System.out.println(i);
        }

    }
}
