package com.ponggame.main;

import javax.swing.*;

import com.ponggame.ui.GamePanel;
import com.ponggame.ui.HomePanel;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Pong Game");
        GamePanel gamePanel = new GamePanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        HomePanel
        frame.add(gamePanel);
        frame.pack();
        frame.setVisible(true);
    }
}
