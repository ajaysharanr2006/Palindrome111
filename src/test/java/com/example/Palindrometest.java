import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.java.Palindrome;

public class Palindrometest {
    @Test
    public void test(String s){
        Palindrome o = new Palindrome();
        assertEquals('madam',o.check(s));

    }

    @Test
    public void ntest(String s){
        Palindrome o = new Palindrome();
        assertEquals('mad',o.check(s));

    }
}
