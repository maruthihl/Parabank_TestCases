package com.example.parabank.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    // Method to load configuration from the resources folder
    public static void loadConfig() {
        try {
            prop = new Properties();

            // Load the config file from the classpath (resources folder)
                   InputStream  input= ConfigReader.class
                   .getClassLoader()
                     .getResourceAsStream("config.properties");
                     if(input==null){
                         System.out.println("❌ Sorry, unable to find config.properties");
                         return;
                     }
            prop.load(input);
            input.close();
            System.out.println("✅ Config file loaded successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get a property value by key
    public static String getProperty(String key) {
        if (prop == null) {
            loadConfig();
        }
        return prop.getProperty(key);
    }
}
