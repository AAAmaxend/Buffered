package com.Jeesey.Array;

//稀疏数组练习
public class SparseArray {
    public static void main(String[] args) {
        int[][] ints = new int[5][10];
        ints[1][1]=1;
        ints[2][3]=2;
        ints[3][6]=3;
        System.out.println("输出原始数组:");
        for (int[] array:ints) {
            for (int anarray:array) {
                System.out.print(anarray+" ");
            }
            System.out.println();
        }
        System.out.println("===============分割线===============");
        System.out.println("准备输出稀疏数组");//转换为稀疏数组保存

        int sum = 0 ; //获取有效值的个数
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (ints[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("其有效值的个数:"+sum+"个");

        //创建一个稀疏数组,行为sum+1,列固定为3
        int[][] ints1 = new int[sum+1][3];
        ints1[0][0] = 5; //初始化行5
        ints1[0][1] = 10; //初始化列10
        ints1[0][2] =sum; //初始化值sum

        //遍历二维数组,将非零值存放在稀疏数组中
        int count = 0; //定义稀疏数组有效值行数
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] != 0){
                    count++;
                    ints1[count][0]=i;//第count行的第1个位置为i
                    ints1[count][1]=j;//第count行的第2个位置为j
                    ints1[count][2]=ints[i][j];
                }
            }
        }
        //迭代遍历输出稀疏数组
        System.out.println("稀疏数组:");
        for (int i = 0; i < ints1.length; i++) {
            System.out.println(ints1[i][0]+"\t"
                            +ints1[i][1]+"\t" +
                            ints1[i][2]);
        }

    }
}
