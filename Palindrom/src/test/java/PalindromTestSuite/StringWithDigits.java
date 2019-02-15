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
public class StringWithDigits {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Strings with digits:");
    }

    @Parameterized.Parameter()
    public boolean expOutput;
    @Parameterized.Parameter(1)
    public String input;

//    public StringWithDigits(boolean expOutput, String input) {
//        this.expOutput = expOutput;
//        this.input = input;
//    }

//    @Parameterized.Parameters
//    public static Collection<Object[]> testConditions() {
//        Object[][] parameters = {
//                {true, "12345054321"},
//                {true, "oj765hh567jo"},
//                {false, "7ololo"},
//                {false, "123450543210"}
//        };
//        return Arrays.asList(parameters);
//    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList( new Object[][] {
                {true, "12345054321"},
                {true, "oj765hh567jo"},
                {false, "7ololo"},
                {false, "123450543210"}
        });
    }

    @Test
    public void testIgnoringCases() {
        assertEquals(expOutput, Palindrom.isStringPalindrom(input));
    }

}
