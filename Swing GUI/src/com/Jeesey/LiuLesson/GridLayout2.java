package com.Jeesey.LiuLesson;

import java.awt.*;

public class GridLayout2 {
    public static void main(String[] args) {
        new MyGridLayout2();
    }
}
class MyGridLayout2 extends Frame {
    public MyGridLayout2(){


        setLocation(300,400);
        setVisible(true);
        setLayout(new GridLayout(3,1));

        Panel panel1 = new Panel(new GridLayout(1,4));
        Panel panel2 = new Panel(new GridLayout(1,1));
        Panel panel3 = new Panel(new GridLayout(1,2));
        Panel panel4 = new Panel(new BorderLayout());
        Panel panel5 = new Panel(new GridLayout(2,1));

        panel1.add(new Button("btn2"), FlowLayout.LEFT);
        panel1.add(new Button("btn1"), FlowLayout.LEFT);
        panel1.add(new Button("btn4"), FlowLayout.RIGHT);
        panel1.add(new Button("btn3"), FlowLayout.RIGHT);//第一排

        panel2.add(new Button("btn5"));//第二排

        panel3.add(new Button("btn6"),BorderLayout.WEST);
        panel3.add(new Button("btn7"),BorderLayout.EAST);//第三排

        panel4.add(new Button("btn8"),BorderLayout.WEST);
        panel5.add(new Button("btn9"));
        panel5.add(new Button("btn10"));
        panel4.add(panel5,BorderLayout.EAST);

        //Frame总加Button
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);


    }
}

