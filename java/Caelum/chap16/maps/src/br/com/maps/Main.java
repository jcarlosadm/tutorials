package br.com.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "João");
        names.put(3, "Maria");
        names.put(2, "Adriano");
        
        String nameTest = names.get(1);
        System.out.println(nameTest);
        
        // usando Properties
        
        Properties config = new Properties();
        config.setProperty("database.login", "charles");
        config.setProperty("database.url", "http://url.com");
        
        System.out.println("");
        System.out.println(config.getProperty("database.login"));
        System.out.println(config.getProperty("database.url"));
    }
}
