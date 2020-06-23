package com.Jeesey.Operator.Classroom;

public class Factorials {
    //factorials阶乘
    public static void main(String[] args) {
        int recursion = Recursion(9);
        System.out.println(recursion);
    }
    //recursion递归
    public static int Recursion(int n){
        if (n==1){
            return n;
        }else{
            return n*Recursion(n-1);
        }

    }
}
