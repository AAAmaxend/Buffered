package com.BytesToBeat.Arr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
     总结:1.Frame是一个顶级窗口
          2.Panel无法单独显示,必须放在某个容器中
          3.布局管理器
             1.流式
             2.东西南北中
             3.表格
          4.监听,大小,定位,背景颜色,可见性

 */

public class Exercise {
    public static void main(String[] args) {
        Frame frame = new Frame("表格");   //总窗口

        frame.setLayout(new GridLayout(2,1));  //窗口网格布局

        //加面板
        JPanel panel = new JPanel(new BorderLayout());
        JPanel pane2 = new JPanel(new GridLayout(2,1));
        JPanel pane3 = new JPanel(new BorderLayout());
        JPanel pane4 = new JPanel(new GridLayout(2,2));

        //面板装按钮
        panel.add(new Button("btn1"),BorderLayout.WEST);
        panel.add(new Button("btn2"),BorderLayout.EAST);
        pane2.add(new Button("btn3"));
        pane2.add(new Button("btn4"));
        panel.add(pane2,BorderLayout.CENTER);
        //完成上一排

        //下一排
        pane3.add(new Button("btn5"),BorderLayout.WEST);
        pane3.add(new Button("btn6"),BorderLayout.EAST);
        for (int i = 7; i < 11; i++) {
            pane4.add(new Button("btn"+ i));
        }
//        pane4.add(new Button("btn7"));
//        pane4.add(new Button("btn8"));
//        pane4.add(new Button("btn9"));
//        pane4.add(new Button("btn10"));
        pane3.add(pane4,BorderLayout.CENTER);  //pane3放中间


//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowIconified(WindowEvent e) {
//                super.windowIconified(e);
//            }
//        }{
//
//        });

        frame.add(panel);  //窗口装面板
        frame.add(pane3);

        frame.setVisible(true);  //显示放最后
        frame.setSize(500,500);
        frame.setLocation(300,400);

        //退出
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
