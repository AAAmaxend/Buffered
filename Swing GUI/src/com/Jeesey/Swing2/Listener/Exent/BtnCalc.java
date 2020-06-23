package com.Jeesey.Swing2.Listener.Exent;

import java.awt.TextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BtnCalc {
    public static void main(String[] args) {
        new MyBtnCalc();
    }
}
class MyBtnCalc extends Frame {
    public MyBtnCalc(){
        //3个文本框,1个按钮,1个标签
        TextField textField1 = new TextField(10);//字符数
        TextField textField2 = new TextField(10);
        TextField textField3 = new TextField(20);
        //1个按钮
        Button button = new Button("=");
        //按钮加监听事件
        button.addActionListener(new MyAction(textField1,textField2,textField3));//按钮监听文本

        //1个标签
        Label label = new Label("+");

        //布局
        setLayout(new FlowLayout());

        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        pack();
        setVisible(true);

        addWindowListener(new WindowAdapter() {//关闭叉叉
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
//监听类
class MyAction implements ActionListener{
    //获取三个变量
    private TextField field1,field2,field3;
    //添加三变量构造器
    public MyAction(TextField field1,TextField field2,TextField field3){
        this.field1=field1;
        this.field2=field2;
        this.field3=field3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        //监听思路:1.获得get加数与被加数
//                  2.将这个值做"+"运算,结果放到set第三个框中
//                  3.消除前两个框

        //获得get加数与被加数
        int i1 = Integer.parseInt(field1.getText());
        int i2 = Integer.parseInt(field2.getText());
        //将这两个值做"+"运算,结果放到set第三个框中
        field3.setText(""+(i1+i2));
        //消除前两个框
        field1.setText("");
        field2.setText("");

    }
}

