package com.Jeeyse.InnerClass;
/*
    匿名:没有名字
    内部类:写在 其他类的内部的 类

    匿名内部类的作用:简化代码
         把子类继承父类、重写父类的方法、创建子类对象 合并成一步完成
         把实现类、实现类接口、重写接口的方法、创建实现类 合并成一步完成
    匿名内部类的最终产物：子类 或者实现类对象,并且这个子类 或者实现类没有名字
    匿名内部类的格式:
       new 父类/接口(){
             重写父类/接口的方法
             };

 */
public class IClass {
    public static void main(String[] args) {
        new Thread(){
            //重写父类Thread类的方法
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i+Thread.currentThread().getName());
                }
            }
        }.start();

        //匿名内部类
        new Thread(new Runnable(){
            //重写Runnable接口的方法
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i+Thread.currentThread().getName());
                }
            }

        }).start();

         new Thread() {
            //重写父类Thread类中的方法,设置线程任务
            @Override
            public void run() {
                super.run();
            }
        };
    }


}
