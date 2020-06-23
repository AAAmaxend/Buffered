package com.Jeesey.Operator;

public class Demo2 {
    public static void main(String[] args) {
        //++  -- 自加,自减
        int a = 3;
        int b = a++;  //执行完这行代码后,先给b赋值,再自增
        //相当于后面还有一行代码a = a + 1 ;

        System.out.println(a);  //4

        //相当于前面还有一行代码 a = a + 1;
        int c = ++a;  //执行完这行代码前,先自增,再赋值
        System.out.println(a);  //5
        System.out.println(b);  //3
        System.out.println(c);  //5

        //幂运算
        double pow = Math.pow(2, 4);
        System.out.println(pow);  //16.0

    }
}
