package org.example.algorithms;

import java.util.HashMap;
import java.util.Map;

public class ROT13 {

    public static String encrypt(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + 13) % 26 + base));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static String decrypt(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + 13) % 26 + base));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

}


