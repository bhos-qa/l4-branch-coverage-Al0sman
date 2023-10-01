package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextEncryptorTest {

    @Test
    public void testAffineEncryptor() {
        assertEquals("Oiph ph l hnzano rnhhlbn", TextEncryptor.AffineEncryptor("This is a secret message", 7, 11));
    }

    @Test
    public void testCaesarEncryptor() {
        assertEquals("Mjqqt", TextEncryptor.CaesarEncryptor("Hello", 5));
    }

    @Test
    public void testCaesarDecryptor() {
        assertEquals("Hello", TextEncryptor.CaesarDecryptor("Mjqqt", 5));
    }

    @Test
    public void testROT13Encryptor() {
        assertEquals("Uryyb Jbeyq", TextEncryptor.ROT13Encryptor("Hello World"));
    }

    @Test
    public void testROT13Decryptor() {
        assertEquals("Hello World", TextEncryptor.ROT13Decryptor("Uryyb Jbeyq"));
    }
}

