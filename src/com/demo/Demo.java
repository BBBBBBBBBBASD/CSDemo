package com.demo;

import java.util.Observable;

public class Demo {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<1000000;i++)
                    System.out.println("-->"+i);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100000;i++)
                    System.out.println("--->"+i);
            }
        }).start();
            System.out.println("结束");
    }
}
