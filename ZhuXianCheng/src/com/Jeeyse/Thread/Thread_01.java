package com.Jeeyse.Thread;

/**
 * 主线程:执行主方法的线程
 *      JVM执行代码的main方法,然后main方法进入到栈内存中.
 *      JVM会让操作系统 开辟一条main方法通向CPU的执行路径.CPU可以通过这个路径执行main方法
 *      这个路径叫做 主线程
 *
 *  单线程:java程序中只有一个线程,程序从main方法开始,从上到下一次执行
 */

public class Thread_01 {
    public static void main(String[] args) {
        Person p1 = new Person("小李" );
        p1.run();
    }
}
