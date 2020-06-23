package com.BytesToBeat.String.File;

import java.io.File;

public class ExFile {
    public static void main(String[] args) {
        //创建一个代表目录的File对象
        File file = new File("C:\\Program Files\\Java\\a");
        //调用FileDir删除方法
        FileDir(file);
    }

    private static void FileDir(File file) {
        //获取表示目录下所有文件的数组

//        File[] files = dir.listFiles();
//        //遍历所有子目录和文件
//        for(File f:files){
//            if (f.isDirectory()){
//                //如果是目录,就递归调用FileDir()
//                FileDir(f);
//            }
//            System.out.println(f.getAbsolutePath());
//        }
    }
}
