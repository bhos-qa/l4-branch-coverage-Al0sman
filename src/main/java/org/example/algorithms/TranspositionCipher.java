package org.example.algorithms;

public class TranspositionCipher {

    public static String encrypt(String text, String key) {
        StringBuilder encryptedText = new StringBuilder();
        int[][] keyMatrix = new int[key.length()][(int) Math.ceil(text.length() / (double) key.length())];
        for (int i = 0; i < key.length(); i++) {
            for (int j = 0; j < keyMatrix[i].length; j++) {
                keyMatrix[i][j] = key.charAt(i) - 'A';
            }
        }

        int row = 0;
        int col = 0;
        for (char c : text.toCharArray()) {
            encryptedText.append(c);
            col++;
            if (col == keyMatrix[row].length) {
                row++;
                col = 0;
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String encryptedText, String key) {
        StringBuilder decryptedText = new StringBuilder();
        int[][] keyMatrix = new int[key.length()][(int) Math.ceil(encryptedText.length() / (double) key.length())];
        for (int i = 0; i < key.length(); i++) {
            for (int j = 0; j < keyMatrix[i].length; j++) {
                keyMatrix[i][j] = key.charAt(i) - 'A';
            }
        }

        int row = 0;
        int col = 0;
        for (char c : encryptedText.toCharArray()) {
            decryptedText.append(c);
            row++;
            if (row == keyMatrix.length) {
                row = 0;
                col++;
            }
        }

        return decryptedText.toString();
    }
}

