package PalindromTestSuite;

import Palindrom.Palindrom;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EmptyString {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing empty string:");
    }

    @Test
    public void testEmptyInputString() {
        assertTrue(Palindrom.isStringPalindrom(""));
    }
}
