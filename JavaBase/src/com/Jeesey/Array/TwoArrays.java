package com.Jeesey.Array;

public class TwoArrays {
    public static void main(String[] args) {
        int[][] arrays = {{1,2},{3,4},{5,6},{7,8}};
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays[i].length; j++) {
//                System.out.println(arrays[i][j]);
//            }
//        }

        printTwoArrays(arrays);

    }
    //二维数组的打印
    public static void printTwoArrays(int[][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]+"\t");
            }
        }
    }


}
