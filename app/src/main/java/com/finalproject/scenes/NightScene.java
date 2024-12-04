package com.finalproject.scenes;


import javax.swing.JLabel;
import javax.swing.JPanel;

import com.finalproject.core.GamePanel;

public class NightScene implements Scene {
    private JPanel nightPanel;
    private JLabel label;

    public NightScene(int night) {
        this.nightPanel = new GamePanel();
        this.label = new JLabel("Night " + night);

        nightPanel.add(label);
    }
    
    public JPanel getPanel() {
        return nightPanel;
    }
}
