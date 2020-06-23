package com.BytesToBeat.String.File;

import java.io.File;
import java.io.FilenameFilter;

public class AcFile {
    public static void main(String[] args) {
        //创建File对象
        File file = new File("C:\\Program Files\\Java\\a");
        //创建过滤器对象
        FilenameFilter filter = new FilenameFilter() {
            //自动产生方法重写 ,实现accept()方法
            @Override
            public boolean accept(File dir, String name) {
             File currFile = new File(dir,name);
             //如果文件名以.java结尾返回true,否则返回false
                if(currFile.isFile() && name.endsWith(".java")){
                    return true;
                }else{
                    return false;
                }


            }
        };
        //判断File对象对应的目录是否存在
        if(file.exists()){
            //获得过滤后的所有文件名数组
            String[] lists = file.list(filter);
            for (String name:
                 lists) {
                System.out.println(name);

            }
        }

    }
}
