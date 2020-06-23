package com.Jeeyse.setName;

public class SetThreadName {
    public static void main(String[] args) {
//       //步骤3.创建Thread类的子类对象
//       MyThread mt = new MyThread();
//       mt.setName("大哥");  //方法1.直接诶使用Thread类中的方法setName(名字)
//       mt.start();


        //步骤3.创建Thread类的子类对象
        new MyThread("小弟").start();  //方法2.创建一个带参数的构造方法,参数来传递线程的名称;再调用父类的带参构造方法,
                                        // 把线程名称传递给父类,让父类给子类取名称

    }
}
