package com.demo;

import com.ui.Background;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private Background background;

    public GamePanel(){
        background = new Background();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawBg(g);
    }

    /*画背景*/
    private void drawBg(Graphics g){
        g.drawImage(background.image,background.x,background.y,null);
        g.drawImage(background.image,background.x+1277,background.y,null);
        background.move();
    }




    public void play(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    repaint();
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
