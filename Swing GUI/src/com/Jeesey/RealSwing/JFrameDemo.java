package com.Jeesey.RealSwing;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    //init()初始化
    public void init(){
        JFrame jFrame = new JFrame("This is JFrame");
        jFrame.setVisible(true);
        jFrame.setBounds(400,400,400,400);

        //设置文字Lable
        Label label = new Label("Welcome to my program!");
        jFrame.add(label);

        //关闭叉叉
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameDemo().init(); //出现什么也没有的窗口
    }

}
