package PalindromTestSuite;

import Palindrom.Palindrom;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WithSpacesOnly {

    @Test
    public void testWithSpacesOnly() {
        assertTrue(Palindrom.isStringPalindrom("     "));
    }
}
