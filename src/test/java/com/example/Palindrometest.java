import com.example.Palindrome;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.Palindrome;

public class Palindrometest {

    @Test
    public void testPalindrome() {
        Palindrome o = new Palindrome();
        assertEquals("madam", o.check("madam"));
    }

    @Test
    public void testNonPalindrome() {
        Palindrome o = new Palindrome();
        assertEquals("mad", o.check("mad"));
    }
}
