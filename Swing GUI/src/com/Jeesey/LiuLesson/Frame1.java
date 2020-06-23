package com.Jeesey.LiuLesson;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame1 {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLayout");
        frame.setLayout(new GridLayout(3,3));
        frame.setSize(300,300);
        frame.setLocation(400,300);
        for (int i = 0; i < 9; i++) {
            Button button = new Button("btn"+(i+1));
            button.setBackground(new Color(198, 91, 230));
            frame.add(button);
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    super.windowClosing(e);
                    System.exit(0);
                }
            });
        }
        frame.setVisible(true);
    }
}
