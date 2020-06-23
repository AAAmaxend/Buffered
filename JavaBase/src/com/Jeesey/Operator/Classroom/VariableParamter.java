package com.Jeesey.Operator.Classroom;

public class VariableParamter {
    public static void main(String[] args) {
     //可变参数
        ComparativeSize(new double[]{});
    }
    public static void ComparativeSize(double...num){
        if (num.length==0){
            System.out.println("none");
        }else{
            double back = num[0];
            for (int i = 0; i < num.length; i++) {
                if (num[i]>back){
                    back = num[i];
                    System.out.println("max="+back);
                }
            }
            return ;
        }
    }
}
