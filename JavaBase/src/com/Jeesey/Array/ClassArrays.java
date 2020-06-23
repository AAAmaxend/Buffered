package com.Jeesey.Array;

import java.util.Arrays;

public class ClassArrays {
    public static void main(String[] args) {
        int[] ints = {12,4,745,679,87,758};

        System.out.println(ints);//输出数组的存储地址
        System.out.println(Arrays.toString(ints));//1) 打印数组:通过toString方法

        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));//3)给数组排序(升序):通过sort方法

        Arrays.fill(ints,66);
        System.out.println(Arrays.toString(ints));//2) 给数组赋值:通过fill方法。将制定字节值分配给指定字节数组的每个元素。
    }

}
