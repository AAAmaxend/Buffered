package com.BytesToBeat.String.File;

import java.io.File;

public class DeFile {
    public static void main(String[] args) {
        File file = new File("C:\\Program Files\\Java\\a");
        if(file.exists())

            System.out.println(file.delete());



        }
    }

