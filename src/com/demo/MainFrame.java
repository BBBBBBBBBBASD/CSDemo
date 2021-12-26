package com.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MainFrame extends JFrame implements Observer,Constants{

    private StartPanel startPanel;//开始游戏界面
    private GamePanel gamePanel;//玩游戏界面
    private Observable ob;
    private Container c ;

    private JMenuBar bar;
    private JMenu jMenu1,jMenu2;
    private JMenuItem item1,item2,item3;

    public MainFrame(Observable ob){
        this.ob = ob;
        ob.addObserver(this);

        initMenuBar();
        c = this.getContentPane();
        c.setLayout(new BorderLayout());
        startPanel = new StartPanel(ob);
        gamePanel = new GamePanel();

        bar.setVisible(false);//设置菜单条不可见
        c.add(startPanel,BorderLayout.CENTER);
        c.add(bar,BorderLayout.NORTH);



        this.setSize(WINDOW_WIDTH,WINDOW_HEIGTH);
        /*获取屏幕高、宽度*/
        int screenW = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenH = Toolkit.getDefaultToolkit().getScreenSize().height;
        /*设置窗体居中*/
        this.setLocation(screenW/2-WINDOW_WIDTH/2,screenH/2-WINDOW_HEIGTH/2);

        /*设置默认关闭按钮*/
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /*初始化菜单条*/
    public void initMenuBar(){
        bar = new JMenuBar();

        jMenu1 = new JMenu("菜单");
        jMenu2 = new JMenu("帮助");

        item1 = new JMenuItem("开始");
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.play();//开始游戏
            }
        });
        item2 = new JMenuItem("暂停");
        item3 = new JMenuItem("退出");

        jMenu1.add(item1);
        jMenu1.add(item2);
        jMenu1.add(item3);

        bar.add(jMenu1);
        bar.add(jMenu2);
    }

    @Override
    public void update(Observable o, Object arg) {
        StartPanel startPanel = (StartPanel) arg;
        c.remove(startPanel);
        bar.setVisible(true);
        c.add(gamePanel,BorderLayout.CENTER);
        repaint();
    }
}
