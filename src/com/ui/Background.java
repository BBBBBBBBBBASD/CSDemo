package com.ui;

import com.demo.Utils;

import java.awt.*;

public class Background extends UIObject{
    public Background(){
        image = Utils.getImage("bg.png");
        x = 0;
        y = 0;
        w = image.getWidth();
        h = image.getHeight();
    }

    public void move(){
        x -= 2;
        if (x <= -1277){
            x = 0;
        }
    }
}
