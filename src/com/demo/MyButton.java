package com.demo;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    public MyButton(String name){
        this.setText(name);
        Font font = new Font("楷体",Font.BOLD,28);
        this.setFont(font);
        /*设置无边距*/
        this.setMargin(new Insets(0,0,0,0));
        this.setForeground(Color.YELLOW);//设置字体颜色
        this.setHorizontalAlignment(CENTER);//居中对齐
        this.setContentAreaFilled(false);//设置透明
    }
}
