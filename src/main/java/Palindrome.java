package com.example;

public class Palindrome {
    public boolean check(String s) {
        if (s == null) return false;
        String r = new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }
}


