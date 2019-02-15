package PalindromTestSuite;

import Palindrom.Palindrom;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CombinedScenarios {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Advanced Scenarios:");
    }


    @Test
    public void testAdvancedPositiveScenario() {
        assertTrue(Palindrom.isStringPalindrom("34gTH!@#$  u8u$#@! HtG43!"));
    }

    @Test
    public void testAdvancedNegativeScenario() {
        assertFalse(Palindrom.isStringPalindrom("  dsfjlksf342%!#$!#@ jljl"));
    }

}
