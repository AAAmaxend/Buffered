package com.Jeesey.Swing.AWT;

import java.awt.*;
        import java.awt.event.MouseAdapter;
        import java.awt.event.MouseEvent;
        import java.awt.event.WindowAdapter;
        import java.awt.event.WindowEvent;
        import java.util.ArrayList;
        import java.util.Iterator;

//测试鼠标监听事件
public class MouseListenerDemo {
    public static void main(String[] args) {
        new MyMouseFrame("画图");
    }
}
//自己的类
class MyMouseFrame extends Frame{
    //画画需要画笔.需要监听鼠标当前的位置,需要集合来存储这个鼠标点
    ArrayList points;

    public MyMouseFrame(String title){//有参构造器
        super(title);
        setBounds(400,400,400,400);
        //Frame存鼠标点击的点
        points = new ArrayList<>();

        //设置可见性
        setVisible(true);
        //关闭叉叉
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.addMouseListener(new MyMouseListener());//鼠标监听器,针对在Frame窗口
    }
    //在Frame中重写画笔方法
    //目的: 实现鼠标画画
    @Override
    public void paint(Graphics g) {//画画,监听鼠标的事件
        Iterator iterator = points.iterator();
        while(iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.red);
            g.fillOval(point.x,point.y,10,10);
        }
    }
    public void addPaint(Point point){
        points.add(point);
    }

}
//适配器模式             实现监听Listener            继承适配器Adapter
class MyMouseListener extends MouseAdapter{
    @Override
    public void mousePressed(MouseEvent e) { //鼠标按压方法
        super.mousePressed(e);
        //强转,拿到当前窗口
        MyMouseFrame myMouseFrame = (MyMouseFrame) e.getSource();//返回当前对象

        //这个我们点击的时候,就会在界面上产生一个点!
        //这个点就是鼠标的点
        myMouseFrame.addPaint(new Point(e.getX(),e.getY()));

        //每次点击鼠标都需要重新画一遍
        myMouseFrame.repaint();//刷新
    }
}