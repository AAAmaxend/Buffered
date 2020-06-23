package com.Jeesey.Swing2.Listener.Exent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//4. 事件监听
public class EventListener {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //按钮,触发事件
        Button button = new Button("btn");
        MyListener myListener = new MyListener();  //监听MyListener
        button.addActionListener(myListener);   //传myListener

        //set按钮信息                        //可以多个按钮只写一个监听类,多个按钮共享同一个事件
        button.setActionCommand("anxin");   //显示的定义触发会返回的命令,如果不set,则走默认值

        //窗口装按钮
        frame.add(button,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setSize(300,300);

//        //结束
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });

        //调用结束的方法
        WinClose(frame);
    }

    //结束
    private static void WinClose(Frame frame){

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
}
class MyListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

        //点击按钮的事件
        System.out.println("惊喜"+e.getActionCommand());
    }
}

