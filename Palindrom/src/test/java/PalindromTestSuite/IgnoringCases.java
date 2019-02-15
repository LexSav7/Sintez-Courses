package PalindromTestSuite;

import Palindrom.Palindrom;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IgnoringCases {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Ignoring Cases:");
    }

    private boolean expOutput;
    private String input;

    public IgnoringCases(boolean expOutput, String input) {
        this.expOutput = expOutput;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        Object[][] parameters = {
                {true, "TTTSSTTT"},
                {true, "ojhhjo"},
                {true, "OlOlolo"},
                {false, "OlOloloO"}
        };
        return Arrays.asList(parameters);
    }

    @Test
    public void testIgnoringCases() {
        assertEquals(expOutput, Palindrom.isStringPalindrom(input));
    }

}
