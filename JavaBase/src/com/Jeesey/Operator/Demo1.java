package com.Jeesey.Operator;

public class Demo1 {
    public static void main(String[] args) {

//        //算术运算符
//        long a = 12342353565434546L;
//        int b = 321;
//        short c = 12;
//        byte d = 8;
//        System.out.println(a+b+c+d);  //自动long
//        System.out.println(b+c+d);  //自动int型
//        System.out.println(c*d);  //自动int型

        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0 ; i <= 100 ; i ++){
            if(i%2 == 0){
                sum1 += i;
            }else{
                sum2 += i;
            }
        }
        System.out.println("0-100之间的奇数和为:"+sum1);
        System.out.println("0-100之间的偶数和为:"+sum2);

    }

}
