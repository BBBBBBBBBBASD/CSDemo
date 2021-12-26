package com.demo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Utils {

    /*获取图片资源*/
    public static BufferedImage getImage(String path){
        try {
            return ImageIO.read(Utils.class.getResourceAsStream("/" + path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
