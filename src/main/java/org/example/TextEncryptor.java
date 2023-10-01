package org.example;

import org.example.algorithms.*;

import java.io.File;
import java.io.IOException;

public class TextEncryptor {

    public static String AffineEncryptor(String plain, Integer key1, Integer key2){

        File tempDir;
        try {
            tempDir = File.createTempFile("Encryption.txt", null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        tempDir.delete();
        tempDir.mkdir();

        return Affine.encrypt(plain,key1,key2);
    }

    public static String AffineDecryptor(String secret, Integer key1, Integer key2){
        return Affine.decrypt(secret,key1,key2);
    }

    public static String CaesarEncryptor(String plain, Integer key){
        return CaesarCipher.encrypt(plain,key);
    }

    public static String CaesarDecryptor(String secret, Integer key){
        return CaesarCipher.decrypt(secret,key);
    }

    public static String ROT13Encryptor(String plain){
        return ROT13.encrypt(plain);
    }

    public static String ROT13Decryptor(String secret){
        return ROT13.decrypt(secret);
    }

    public static String TranspositionEncryptor(String plain, String key){
        return TranspositionCipher.encrypt(plain,key);
    }

    public static String TranspositionDecryptor(String secret, String key){
        return TranspositionCipher.decrypt(secret,key);
    }

    public static String XOREncryptor(String plain, String key){
        return XOR.encrypt(plain,key);
    }

    public static String XORDecryptor(String secret, String key){
        return XOR.decrypt(secret,key);
    }

}
