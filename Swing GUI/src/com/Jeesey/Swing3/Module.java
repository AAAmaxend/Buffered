package com.Jeesey.Swing3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Module {
    public static void main(String[] args) {
//        //Frame ,JDK ,新建
//        Frame frame = new Frame("My first JavaGUI:");
//        //设置可见性
//        frame.setVisible(true);
//        //设置窗口大小
//        frame.setSize(500,500);
//        //设置背景颜色
//        frame.setBackground(Color.PINK);
//        //设置窗口弹出的初始位置
//        frame.setLocation(300,300);
//        //设置弹出的固定位置
//        frame.setResizable(false);


        Frame frame = new Frame("BorderLayout");

        Button button1 = new Button("East");
        Button button2 = new Button("West");
        Button button3 = new Button("North");
        Button button4 = new Button("South");
        Button button5 = new Button("Center");
        frame.setLayout(new BorderLayout());
        frame.add(button1,BorderLayout.EAST);
        button1.setBackground(new Color(55, 55, 174));
        frame.add(button2,BorderLayout.WEST);
        button2.setBackground(new Color(171, 83, 186));
        frame.add(button3,BorderLayout.NORTH);
        button3.setBackground(new Color(79, 196, 68));
        frame.add(button4,BorderLayout.SOUTH);
        button4.setBackground(new Color(186, 33, 45));
        frame.add(button5,BorderLayout.CENTER);

        frame.setSize(300,300);
        frame.setLocation(300,300);
        frame.setBackground(new Color(105, 186, 51));
        frame.setVisible(true);
        //箭头关闭
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });



    }

}
