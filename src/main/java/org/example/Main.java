package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> properties = new HashMap<>();
        properties.put("login", "Angelina");
        properties.put("password", "angelinaInHollywood123");
        properties.put("title", "Salt");
        properties.put("url", "www.angelina.hollywood");
        properties.put("errorMessage", "file has not been found");

        String[] sensualKeys = {"login", "password", "url"};

        properties.forEach((key, value) -> {
            if (Arrays.asList(sensualKeys).contains(key)) {
                System.out.println(key + Message.COVERED_KEY.getMessage());
            } else {
                System.out.println(key + Message.SEPARATOR.getMessage() + value);
            }
        });


        if (properties.isEmpty()) {
            System.out.println(Message.EMPTY.getMessage());
        }

    }
}