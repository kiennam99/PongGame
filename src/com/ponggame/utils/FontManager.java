package com.ponggame.utils;

import java.awt.Font;

public class FontManager {
    public static final Font TITLE_FONT = new Font("Arial", Font.BOLD, 36);
    public static final Font BUTTON_FONT = new Font("Arial", Font.BOLD, 26);
    public static final Font SCORE_FONT = new Font("Arial", Font.BOLD, 24);
    public static final Font SMALL_TEXT_FONT = new Font("Arial", Font.PLAIN, 16);

    public static Font createFont(String name, int style, int size) {
        return new Font(name, style, size);
    }
}
