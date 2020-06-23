package com.Jeesey.Operator;

public class Demo7
{
    public static void main(String[] args) {
/*      args.length
        命令行传参,show in explore -> 路径cmd -> src下面加上包名,类名
        cd../ 转到src目录下  ->  java com.Jeesey.Operator.Demo7  ->  传递参数:java com.Jeesey.Operator.Demo7 Good morning  ->  出现效果

 */
        for (int i=0 ; i < args.length ; i++){
            System.out.println("args[i]="+args[i]);
        }

    }
}
