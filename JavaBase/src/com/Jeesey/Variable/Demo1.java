package com.Jeesey.Variable;

public class Demo1 {
    String name;  //实例变量,从属于对象;且这个类型的默认值为0.0 或者null:布尔值默认为false
    int age;

    static double salary = 3000;  //类变量 static


    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();  //实例变量,从属于对象;且这个类型的默认值为0.0 或者null:布尔值默认为false

        System.out.println(demo1.age);
        System.out.println(demo1.name);
        System.out.println(salary);  //static省去demo1对象

    }
}
