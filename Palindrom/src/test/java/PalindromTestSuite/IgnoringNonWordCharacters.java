package PalindromTestSuite;

import Palindrom.Palindrom;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IgnoringNonWordCharacters {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Ignoring Non Word Characters:");
    }


    private boolean expOutput;
    private String input;

    public IgnoringNonWordCharacters(boolean expOutput, String input) {
        this.expOutput = expOutput;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        Object[][] parameters = {
                {true, "Madam, I'm Adam!"},
                {true, "!@#$%%$#@!"},
                {true, "ая !@#$%_3aBbA3_%$#@! яа"}
        };
        return Arrays.asList(parameters);
    }

    @Test
    public void testIgnoringSpecialCharacters() {
        assertEquals(expOutput, Palindrom.isStringPalindrom(input));
    }


}
