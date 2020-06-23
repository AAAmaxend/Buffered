package com.Jeesey.Swing2.Listener.Exent;

import java.awt.*;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextField2 {
    public static void main(String[] args) {
        new MyTextField();
    }
}
class MyTextField extends Frame {
    public MyTextField(){
        //新建文本框,放文本域
        TextField field = new TextField();
        add(field);

        //监听这个文本框输入的文字
        MyActionListener2 myActionListener2 = new MyActionListener2();
        field.addActionListener(myActionListener2); //明文输入

        //设置密文编码
        field.setEchoChar('*');

        //箭头关闭
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        setVisible(true);
        pack();

    }
}
class MyActionListener2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField f = (TextField) e.getSource();//获得一些资源,在这里返回一个TextField对象
        System.out.println(f.getText());//键盘里get获得输入框中的文本输出
        //回车即清空
        f.setText("");
    }
}




