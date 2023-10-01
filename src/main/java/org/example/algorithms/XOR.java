package org.example.algorithms;

public class XOR {

    public static String encrypt(String text, String key) {
        byte[] textBytes = text.getBytes();
        byte[] keyBytes = key.getBytes();

        byte[] encryptedBytes = new byte[textBytes.length];
        for (int i = 0; i < textBytes.length; i++) {
            encryptedBytes[i] = (byte) (textBytes[i] ^ keyBytes[i]);
        }

        return new String(encryptedBytes);
    }

    public static String decrypt(String encryptedText, String key) {
        byte[] encryptedBytes = encryptedText.getBytes();
        byte[] keyBytes = key.getBytes();

        byte[] decryptedBytes = new byte[encryptedBytes.length];
        for (int i = 0; i < encryptedBytes.length; i++) {
            decryptedBytes[i] = (byte) (encryptedBytes[i] ^ keyBytes[i]);
        }

        return new String(decryptedBytes);
    }
}

