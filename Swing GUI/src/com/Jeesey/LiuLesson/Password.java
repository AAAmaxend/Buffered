package com.Jeesey.LiuLesson;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password {
    public static void main(String[] args) {
        Frame frame = new Frame("我的用户界面");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        Button button = new Button("btn1");
        frame.add(button,FlowLayout.LEFT);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 9; i++) {
                    frame.add(new Button(i+"button"));
                    frame.setVisible(true);
                }

            }
        });


        frame.setVisible(true);
        frame.setLocation(300,300);

    }

}
