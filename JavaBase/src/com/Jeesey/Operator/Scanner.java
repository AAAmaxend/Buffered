package com.Jeesey.Operator;

public class Scanner {

    public static void main(String[] args) {
        //输入多个数字,并求其总和与平均数,每输入一个数字用回车确认,通过输入非数字来结束输入并输出结果
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = 0 ;
        int sum = 0 ;
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"个数据:");
            int b = scanner.nextInt();
            sum+=b;

        }
        System.out.println("总和为:"+sum+",平均数为"+(sum/5));

        scanner.close();


    }
}
