package com.Jeesey.Swing.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintDemo {
    public static void main(String[] args) {
        new Mypaint().loadFrame();//制作白板.调用方法
    }
}
class Mypaint extends Frame{
    //方法
    public void loadFrame(){

        setVisible(true);
        setBounds(600,600,600,600);

        //关闭叉叉
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {//在Frame重写画笔方法
        super.paint(g);
//        g.setColor(Color.red);//画笔需要颜色
        g.fillRect(50,50,200,200);//可以画画
//        g.setColor(Color.yellow);
        g.fillOval(200,200,200,200);

        //养成习惯,用完画笔将其还原为最初的颜色,即注释掉成黑色
    }
}