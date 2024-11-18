package com.ponggame.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ButtonFactory {
    public static JButton createButton(String text, ActionListener action) {
        JButton button = new JButton(text);
        button.setFont(FontManager.BUTTON_FONT);
        button.setFocusPainted(false);
        button.setBackground(Color.LIGHT_GRAY);
        button.setForeground(Color.black);
        button.addActionListener(action);
        return button;
    }

    public static JButton createCustomButton(String text, Font font, Color bgColor, Color fgColor,
            ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setFont(font);
        button.setFocusPainted(false);
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        button.addActionListener(actionListener);
        return button;
    }
}
