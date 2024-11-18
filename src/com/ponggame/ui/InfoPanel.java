package com.ponggame.ui;

import com.ponggame.utils.FontManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoPanel extends JPanel {
    private GamePanel gamePanel;
    private JLabel scoreLabel;

    public InfoPanel(JFrame frame) {
        this.setLayout(new BorderLayout());

        gamePanel = new GamePanel();
        this.add(gamePanel, BorderLayout.CENTER);

        JPanel infoPanel = new JPanel();
        infoPanel.setPreferredSize(new Dimension(200, 600));
        infoPanel.setBackground(Color.LIGHT_GRAY);
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));

        // Score Label
        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setFont(FontManager.SCORE_FONT);
        scoreLabel.setAlignmentX(CENTER_ALIGNMENT);
        infoPanel.add(scoreLabel);

        // Buttons
        JButton pauseButton = new JButton("Pause");
        pauseButton.setAlignmentX(CENTER_ALIGNMENT);
        pauseButton.addActionListener(e -> gamePanel.pauseGame());
        infoPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        infoPanel.add(pauseButton);

        JButton restartButton = new JButton("Restart");
        restartButton.setAlignmentX();
    }
}
