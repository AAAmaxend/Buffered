
package com.Jeesey.Array;

public class UseArr {
    public static void main(String[] args) {
        int[] arrays={1,2,45,56,67};
//        //数组方法入参遍历
//        printArrays(arrays);

//        //for-each循环数组
//        for (int arr: arrays) {
//            System.out.print(arr+"\t");
//        }

//        //for循环遍历数组
//        for (int i = 0; i < arrays.length; i++) {
//            System.out.println(arrays[i]);
//        }


//
//        reverse(arrays);


        reverse2(arrays);

   }
//// 数组做方法入参
//    public static void printArrays(int[] arrays){
//        for (int i = 0; i < arrays.length; i++) {
//            System.out.print(arrays[i]+"\t");
//        }
//    }

//
    //数组的倒序输出方法1
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];
        //顺序操作
        for (int i = 0 , j = arrays.length-1; i < arrays.length ; i++ , j--) {
            result[j] = arrays[i];
            System.out.println(result[j]);
        }
        return result;
}
    //数组的倒序输出方法
    public static void reverse2(int[] arrays){
        for (int i = arrays.length-1; i >= 0 ; i--) {
            System.out.println(arrays[i]);
        }
    }

}
