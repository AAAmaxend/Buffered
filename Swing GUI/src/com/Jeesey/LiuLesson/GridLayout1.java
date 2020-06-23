package com.Jeesey.LiuLesson;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayout1 {
    public static void main(String[] args) {
        new MyFrame();
    }
}
class MyFrame extends Frame{
    public MyFrame(){
        setSize(400,400);
        setLocation(300,300);
        setBackground(Color.PINK);
        setVisible(true);
        setLayout(new GridLayout(3,1)); //总的框架

        //加三个面板
        Panel  Panel1= new Panel(new GridLayout(1,4));
        Panel  Panel2= new Panel(new GridLayout(1,1));
        Panel  Panel3= new Panel(new BorderLayout());
        Panel  Panel4= new Panel(new GridLayout(3,1));

        Panel1.add(new Button("btn2"),FlowLayout.LEFT);
        Panel1.add(new Button("btn1"),FlowLayout.LEFT);
        Panel1.add(new Button("btn4"),FlowLayout.RIGHT);
        Panel1.add(new Button("btn3"),FlowLayout.RIGHT);//上一排

        Panel2.add(new Button("btn5"));//中间一排

        Panel3.add(new Button("btn6"), BorderLayout.WEST);//最下边一排
        Panel4.add(new Button("btn7"));
        Panel4.add(new Button("btn8"));
        Panel4.add(new Button("btn9"));
        Panel3.add(Panel4,BorderLayout.CENTER);
//        //最下边
//        for (int i = 8; i < 12; i++) {
//            Panel3.add(new Button("btn"+i));
//        }
        add(Panel1);
        add(Panel2);
        add(Panel3);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }
}
