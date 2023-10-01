package org.example.algorithms;

public class Affine {

    public static String encrypt(String plainText, int a, int b) {
        StringBuilder encryptedText = new StringBuilder();

        for (char c : plainText.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                int x = c - base;
                int encryptedChar = (a * x + b) % 26;
                if (encryptedChar < 0) {
                    encryptedChar += 26; // Ensure it's positive
                }
                encryptedText.append((char) (encryptedChar + base));
            } else {
                encryptedText.append(c);
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String encryptedText, int a, int b) {
        int aInverse = findMultiplicativeInverse(a);
        StringBuilder decryptedText = new StringBuilder();

        for (char c : encryptedText.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                int x = c - base;
                int decryptedChar = (aInverse * (x - b)) % 26;
                if (decryptedChar < 0) {
                    decryptedChar += 26; // Ensure it's positive
                }
                decryptedText.append((char) (decryptedChar + base));
            } else {
                decryptedText.append(c);
            }
        }

        return decryptedText.toString();
    }

    private static int findMultiplicativeInverse(int a) {
        for (int x = 1; x < 26; x++) {
            if ((a * x) % 26 == 1) {
                return x;
            }
        }
        return -1; // Inverse doesn't exist
    }

}
