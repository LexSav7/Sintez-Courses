package dfTest;

import df.ExpressionHelper;
import df.LongestPalindrome;
import org.junit.Test;

public class LongestPalindromeTest {

    @Test
    public void testGetLongestPalindromeLength() {

        String[] strings = {
            "",
            " ",

            "test",
            "madam",

            "12321",
            "!@##@!",

            "MaDAm",
            "!123 @#MaDA m#@321!",
        };

        System.out.println(new LongestPalindrome().getLongestPalindromeLength(strings, ExpressionHelper:: isPalindrome));
    }
}
