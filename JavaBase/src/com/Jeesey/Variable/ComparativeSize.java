package com.Jeesey.Variable;

public class ComparativeSize {
    public static void main(String[] args) {
        Size(3,3);

    }
    public static void Size(int a,int b){
        if(a==b){
            System.out.println("a=b="+a);
        }else if(a>b){
            System.out.println("max="+a);
        }else{
            System.out.println("max="+b);
        }
        return;
    }

}
