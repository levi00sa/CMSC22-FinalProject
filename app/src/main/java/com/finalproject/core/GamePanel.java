package com.finalproject.core;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.Border;

public class GamePanel extends JPanel{
    GamePanel(int width, int height, Border border, boolean isEnabled, boolean isVisible) {
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.BLACK);
        this.setBorder(border);
        this.setEnabled(isEnabled);
        this.setVisible(isVisible);
    }
}
