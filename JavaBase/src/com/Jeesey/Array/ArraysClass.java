package com.Jeesey.Array;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        //Arrays类的功能
        int[] arr = {1,345,56,876,89,465,356};
        //1.打印数组
        System.out.println(Arrays.toString(arr));
        //2.数组按升序排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //3.二分查询法
        int index = Arrays.binarySearch(arr,345);
        System.out.println(index);
        //4.给数组赋值填充
        Arrays.fill(arr,2,6,6);  //a[2]~a[5]左闭右开都替换成6
        System.out.println(Arrays.toString(arr));
    }
}
