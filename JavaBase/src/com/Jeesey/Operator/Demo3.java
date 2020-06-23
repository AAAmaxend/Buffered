package com.Jeesey.Operator;

public class Demo3 {
    public static void main(String[] args) {
        //短路运算
        int a = 5;
        boolean b = (a < 5) && (a++ > 5);  //如果第一个是false,则不会执行后面的代码,叫做短路运算
        System.out.println(b);
        System.out.println(a);
        System.out.println("=====================================");

        //与and 或or 非not
        boolean i = true;
        boolean j = false;
        System.out.println("i&&j:"+(i&&j));  //与
        System.out.println("i||j:"+(i||j));  //或
        System.out.println("!(i&&j):"+!(i&&j));  //非
        System.out.println("======================================");

        //算术运算符
        short m = 5;
        short n = 3;
        System.out.println("5>3:"+(5>3));
        System.out.println("5<3:"+(5<3));

        //位运算符:&  |  ^  -  >>  <<  >>>

    }

}
