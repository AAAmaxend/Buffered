package com.Jeesey.Operator.Classroom;

public class Demo1 {
    public static void main(String[] args) {
        //计算0-100之间的奇数和偶数和
        int sum1= 0 ;
        int sum2= 0 ;
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        System.out.println("奇数sum1="+sum1);
        System.out.println("偶数sum2="+sum2);

    }
}
