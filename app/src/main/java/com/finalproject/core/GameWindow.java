package com.finalproject.core;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameWindow extends JFrame {
    public GameWindow() {

        this.setTitle("FNAF GAME");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
        // this.setSize(screenSize.width, screenSize.height);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.BLUE);

        ImageIcon image = new ImageIcon("logo.png");

        this.setIconImage(image.getImage());
        // this.getContentPane().setBackground(new Color(0, 0, 0));
    }
}
