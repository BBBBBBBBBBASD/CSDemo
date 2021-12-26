package com.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class StartPanel extends JPanel implements Constants{

    private Image image;

    private Observable ob;

    private JButton btnS,btnE;

    public StartPanel(Observable ob){
        this.ob = ob;
        image = Utils.getImage("main.png");
        btnS = new MyButton("开始游戏");
        btnE = new MyButton("结束游戏");

        btnE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ob.notifyObservers(StartPanel.this);
            }
        });

        Dimension sizeS = btnS.getPreferredSize();
        Dimension sizeE = btnE.getPreferredSize();

        this.setLayout(null);
        btnS.setBounds(WINDOW_WIDTH/2-sizeS.width/2,
                WINDOW_HEIGTH/2-sizeS.height/2-25,
                sizeS.width,sizeS.height);

        btnE.setBounds(WINDOW_WIDTH/2-sizeE.width/2,
                WINDOW_HEIGTH/2-sizeE.height/2+25,
                sizeE.width,sizeE.height);

        this.add(btnS);
        this.add(btnE);

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        /*画图片*/
        g.drawImage(image,0,0,WINDOW_WIDTH,WINDOW_HEIGTH,null);
        super.paintComponents(g);//绘制子组件
    }
}
