package com.demo;


import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainClass{


    public static void main(String[] args) {
        PanelObservable ob = new PanelObservable();
        MainFrame mainFrame = new MainFrame(ob);
    }
}
