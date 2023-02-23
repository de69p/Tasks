package org.example;

public class PalindromeChecker {
    public boolean isPalindrome(String s) {
        String cleanString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversedString = new StringBuilder(cleanString).reverse().toString();
        return cleanString.equals(reversedString);
    }
}