package com.Jeeyse.SolveThread;

public class Solu2Demo {
    public static void main(String[] args) {
        Solu2Thread solu2 = new Solu2Thread();
        Thread t1 = new Thread(solu2);
        Thread t2 = new Thread(solu2);
        Thread t3 = new Thread(solu2);
        t1.start();
        t2.start();
        t3.start();

    }
}
