package PalindromTestSuite;

import Palindrom.Palindrom;
import org.junit.Test;
import static org.junit.Assert.*;

public class NullInput {

    @Test (expected = NullPointerException.class)
    public void testNullStringInput() {
        assertTrue(Palindrom.isStringPalindrom(null));
    }
}
