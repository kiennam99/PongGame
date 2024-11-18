package com.ponggame.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.ponggame.game.Ball;
import com.ponggame.game.ConfigLoader;
import com.ponggame.game.Paddle;
import com.ponggame.utils.FontManager;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private final int WIDTH = ConfigLoader.getInt("width", 600);
    private final int HEIGHT = ConfigLoader.getInt("height", 800);

    private Timer timer;
    private Paddle paddle;
    private Ball ball;
    private int score;

    public GamePanel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(this);

        paddle = new Paddle(WIDTH / 5 * 4, HEIGHT / 5 * 4, 100, 10);
        ball = new Ball(WIDTH / 3, HEIGHT / 3, 20, 20);

        score = 0;
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paddle.draw(g);
        ball.draw(g);

        g.setColor(Color.WHITE);
        g.setFont(FontManager.SCORE_FONT);
        g.drawString("Score: " + score, 20, 30);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ball.move();
        ball.checkCollision(paddle, WIDTH, HEIGHT);
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> paddle.move(-20);
            case KeyEvent.VK_RIGHT -> paddle.move(20);
            case KeyEvent.VK_ESCAPE -> System.exit(0);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
