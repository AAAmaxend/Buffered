package com.Jeesey.Array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {1,256,75,8,5,970};
        int[] bubble = Bubble(arr);
        System.out.println(Arrays.toString(bubble));
    }
    public static int[] Bubble(int[] array){
        int temp=0;
        //外层循环,判断需要循环多少次
        for (int i = 0; i < array.length; i++) {
            //内层循环,比较两个数的大小.若第一个数比第二个数大,则交换位置
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1]>array[j]){
                    //交换位置
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
