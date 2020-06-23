package com.Jeesey.Swing.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextExer1 {
    public static void main(String[] args) {
        new MyFrame2();
    }
}
class MyFrame2 extends Frame {
    public MyFrame2(){
        //总Frame加textField
        TextField textField = new TextField();
        add(textField);

        //开始监听
        MyActionListener3 myActionListener3 = new MyActionListener3();
        textField.addActionListener(myActionListener3);//明文形式

        textField.setEchoChar('*');

        setVisible(true);
        setSize(300,300);

    }
}
class MyActionListener3 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField f = (TextField) e.getSource();//键盘获得一些信息
        System.out.println(f.getText());//键盘输出一些信息
        f.setText("");

    }
}
