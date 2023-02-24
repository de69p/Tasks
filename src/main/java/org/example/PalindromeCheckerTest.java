package org.example;

import org.junit.Assert;
import org.junit.Test;


public class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        Assert.assertTrue(palindromeChecker.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(palindromeChecker.isPalindrome("race a car"));
        Assert.assertTrue(palindromeChecker.isPalindrome(""));
        Assert.assertTrue(palindromeChecker.isPalindrome("Mr. Owl ate my metal worm"));
        Assert.assertFalse(palindromeChecker.isPalindrome("Not a palindrome"));
    }
}
