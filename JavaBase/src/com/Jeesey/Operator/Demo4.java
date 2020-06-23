package com.Jeesey.Operator;

public class Demo4 {
    public static void main(String[] args) {
        //用while或for循环输出1-1000之间的能被5整除的的数
        //并且每行输出5个
        for (int i = 1; i <= 1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t");
            }
            if (i%25==0){
                System.out.println();
            }
        }
    }
}
