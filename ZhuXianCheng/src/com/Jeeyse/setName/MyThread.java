package com.Jeeyse.setName;
/*
   改变/设置线程名称:
     方法1.直接诶使用Thread类中的方法setName(名字)
     方法2.创建一个带参数的构造方法,参数来传递线程的名称;再调用父类的带参构造方法,
           把线程名称传递给父类,让父类给子类取名称
 */

//步骤1.定义一个Thread类的子类
public class MyThread extends Thread {
    //步骤2.重写Thread类的run方法,来设置线程任务
    @Override
    public void run() {
      //获取线程的名称
        System.out.println(Thread.currentThread().getName());
    }

    public MyThread(){

    }
    public MyThread(String name){
        super(name);  //把线程名称传递给父类,让父类给子类取名称
    }






}
