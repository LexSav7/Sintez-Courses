package PalindromTestSuite;

import Palindrom.Palindrom;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringWithOneChar {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing string with one character:");
    }

    @Test
    public void testStringWithOneChar() {
        assertTrue(Palindrom.isStringPalindrom("a"));
    }
}
