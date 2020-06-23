package com.BytesToBeat.String.File;

import java.io.File;

public class IFile {
    public static void main(String[] args) {
        //创建File对象
        File file = new File("C:\\Program Files\\Java\\a");
        //判断File对象对应的目录是否存在
        if(file.isDirectory()){
            //获得目录下的所有文件的文件名
            String[] names = file.list();
            for (String name:names){
                System.out.println(name);
            }

        }
    }
}
