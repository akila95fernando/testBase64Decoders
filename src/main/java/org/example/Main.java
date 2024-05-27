package org.example;

import java.util.Base64;
import org.apache.axiom.util.base64.Base64Utils;

public class Main {

    public static void main(String[] args) {
        // Sample Base64 encoded string
        String base64EncodedString = "SGVsbG8sIFdvcmxkIQ=="; // "Hello, World!"

        // Decode using java.util.Base64
        try {
            byte[] decodedBytesJavaUtil = java.util.Base64.getDecoder().decode(base64EncodedString);
            String decodedStringJavaUtil = new String(decodedBytesJavaUtil);
            System.out.println("Decoded using java.util.Base64: " + decodedStringJavaUtil);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception using java.util.Base64: " + e.getMessage());
        }

        // Decode using org.apache.axiom.util.base64.Base64Utils
        try {
            byte[] decodedBytesAxiom = Base64Utils.decode(base64EncodedString);
            String decodedStringAxiom = new String(decodedBytesAxiom);
            System.out.println("Decoded using org.apache.axiom.util.base64.Base64Utils: " + decodedStringAxiom);
        } catch (Exception e) {
            System.out.println("Exception using org.apache.axiom.util.base64.Base64Utils: " + e.getMessage());
        }
    }
}