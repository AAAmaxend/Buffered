package com.Jeesey.Swing2.Listener.Exent;

import java.awt.*;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BtnCalc2 {
    public static void main(String[] args) {
        new MyBtnCalc2();
    }
}
class MyBtnCalc2 extends Frame{
    public MyBtnCalc2(){
        //3个文本框
        TextField textField1 = new TextField(10);//字符数
        TextField textField2 = new TextField(10);
        TextField textField3 = new TextField(20);
        //一个按钮
        Button button = new Button("=");
        //按钮监听文本
        button.addActionListener(new MyActionBtnCalc2(textField1,textField2,textField3));//实参
        //一个标签
        Label label = new Label("-");
        //布局
        setLayout(new FlowLayout());
        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        setVisible(true);
        pack();
        //关闭叉叉
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
class MyActionBtnCalc2 implements ActionListener {
    //获取变量,再有构造器
    private TextField field1,field2,field3;
    public MyActionBtnCalc2(TextField field1, TextField field2,TextField field3) {//形参
        this.field1=field1;
        this.field2=field2;
        this.field3=field3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
  /*
  计算器思路:
    1.获得减数与被减数
    2.将这两个值做减法运算,,结果放到第三个框
    3.清除前两个框
   */
        //获得get减数与被减数的文本
        int i = Integer.parseInt(field1.getText());
        int i1 = Integer.parseInt(field2.getText());
        //将这两个值做减法运算,结果放到set第三个框
        if(i>i1) {
           field3.setText("" + (i - i1));
        }else if(i<i1){
            field3.setText(""+"-"+(i1-i));
        }else{
            field3.setText("0");
        }
        //清除前两个框
        field1.setText("");
        field2.setText("");

    }
}