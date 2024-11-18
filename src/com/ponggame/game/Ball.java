package com.ponggame.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {
    private int x, y, width, height;

    private int dx = 3, dy = 3;

    public Ball(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void move() {
        x += dx;
        y += dy;

        if (x <= 0 || x + width >= ConfigLoader.getInt("width", 600)) {
            dx *= -1; // Bounce off the left and right wall
        }

        if (y <= 0) {
            dy *= -1; // Bounce off the top wall
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public void checkCollision(Paddle paddle, int screenWidth, int screenHeight) {
        if (getBounds().intersects(paddle.getBound())) {
            dy *= -1; // Bouncing
        }

        if (y + height >= screenHeight) {
            // game over or restart
            x = screenWidth / 2 - width / 2;
            y = screenHeight / 2 - height / 2;
            dx = 3;
            dy = -3;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, width, height);
    }

}
