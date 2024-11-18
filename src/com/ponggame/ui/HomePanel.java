package com.ponggame.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.ponggame.game.ConfigLoader;
import com.ponggame.utils.ButtonFactory;
import com.ponggame.utils.FontManager;

public class HomePanel extends JFrame {
    private final int WIDTH = ConfigLoader.getInt("width", 600);
    private final int HEIGHT = ConfigLoader.getInt("height", 800);

    public HomePanel(JFrame frame) {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Welcome to Pong Game", SwingConstants.CENTER);
        titleLabel.setFont(FontManager.TITLE_FONT);
        titleLabel.setForeground(Color.BLUE);
        this.add(titleLabel, BorderLayout.CENTER);

        JButton startButton = ButtonFactory.createButton("Start Game", e -> {
            frame.getContentPane().removeAll();
            frame.add(new InfoPanel(frame));
            frame.revalidate();
            frame.repaint();
        })

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }
}
