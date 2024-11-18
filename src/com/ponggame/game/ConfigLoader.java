package com.ponggame.game;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private static Properties properties = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            System.err.println("Failed to load configuration file: " + e.getMessage());
            properties.setProperty("width", "600");
            properties.setProperty("height", "800");
            properties.setProperty("dx", "3");
            properties.setProperty("dy", "3");
        }
    }

    public static int getInt(String key, int defaultValue) {
        try {
            return Integer.parseInt(properties.getProperty(key, String.valueOf(defaultValue)));
        } catch (NumberFormatException e) {
            System.err.println("Invalid format for key: " + key);
            return defaultValue;
        }

    }

}
