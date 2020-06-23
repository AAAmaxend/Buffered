package com.Jeesey.Swing2.Listener.Exent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextField {
    public static void main(String[] args) {
        new MyFrame();
    }
}
class MyFrame extends JFrame {   //建总窗口
    public MyFrame(){
        //文本框
        JTextField jTextField = new JTextField();
        add(jTextField);
        //监听文本框 输入的文字
        MyActionListener myActionListener = new MyActionListener();  //监听文本框的文字
        jTextField.addActionListener(myActionListener);

        //按钮的触发事件
        JButton button1 = new JButton();
        MyActionListener myActionListener1 = new MyActionListener();
        button1.addActionListener(myActionListener1);
        add(button1,BorderLayout.CENTER);

        ////面板
        JPanel jPanel = new JPanel();
        jPanel.setSize(200,200);
        jPanel.setBackground(new Color(50,79,56,87));
        add(jPanel);


        //Frame的属性
        setSize(300,300);
        setVisible(true);




    }
    private static void Close(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(-1);
            }
        });

    }


}
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField field = (JTextField) e.getSource();  //add了TextField对象,获得一些资源,返回一个对象
        System.out.println(field.getText());  //获得文本

        //回车即清空
        field.setText("");
    }
}



