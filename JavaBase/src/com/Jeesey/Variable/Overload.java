package com.Jeesey.Variable;

public class Overload {
    public static void main(String[] args) {
        ComparativeSize(34.56,67.8);
        ComparativeSize(90,78);
    }
    public static void ComparativeSize(double num1,double num2){
        if(num1==num2){
            System.out.println("num1=num2="+num1);
        }else if(num1>num2){
            System.out.println("max="+num1);
        }else{
            System.out.println("max="+num2);
        }
        return;
    }
    public static void ComparativeSize(int num1,int num2) {
        if (num1 == num2) {
            System.out.println("num1=num2=" + num1);
        } else if (num1 > num2) {
            System.out.println("max=" + num1);
        } else {
            System.out.println("max=" + num2);
        }
        return;
    }
}
