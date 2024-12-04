package com.finalproject.core;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameWindow extends JFrame {
    public GameWindow(String title,  int width, int height, boolean isUndecorated, int extendedState, boolean isResizable, boolean isAlwaysOnTop, ImageIcon logo) {
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(isResizable);
        this.setSize(width, height);
        this.setUndecorated(isUndecorated);
        this.setExtendedState(extendedState);
        this.getContentPane().setBackground(Color.BLACK);
        this.setAlwaysOnTop(isAlwaysOnTop);
        // this.setVisible(true);


        // ImageIcon image = logo;
        // this.setIconImage(image.getImage());
        
    }
} 