package PalindromTestSuite;

import Palindrom.Palindrom;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicScenarios {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Basic Scenarios:");
    }

    @Test
    public void testBasicPositiveScenario() {
        assertTrue(Palindrom.isStringPalindrom("ololo"));
    }

    @Test
    public void testBasicNegativeScenario() {
        assertFalse(Palindrom.isStringPalindrom("negative"));
    }
}
