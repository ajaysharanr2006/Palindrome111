package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Palindrometest {

    @Test
    public void testPalindrome() {
        Palindrome o = new Palindrome();
        assertTrue(o.check("madam"), "Should return true for 'madam'");
    }

    @Test
    public void testNonPalindrome() {
        Palindrome o = new Palindrome();
        assertFalse(o.check("mad"), "Should return false for 'mad'");
    }
}
