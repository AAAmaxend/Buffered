package com.Jeesey.Operator;

public class Demo6 {
    //用方法来比较大小
    public static void main(String[] args) {
        int max=max(10,20);
        System.out.println(max);

    }
    public static  int max(int a, int b){   //void返回值在函数里没有
        if (a==b){                          //在方法体里就要有return返回值
            System.out.println("a==b");
            return 0;
        }else if (a>b){
            return a;
        }else{
            return b;
        }
    }

}
