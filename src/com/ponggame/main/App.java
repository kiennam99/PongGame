package com.ponggame.main;

import com.ponggame.ui.HomePanel;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Pong Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        HomePanel homePanel = new HomePanel(frame);
        frame.add(homePanel);
        frame.pack();
        frame.setVisible(true);
    }
}
