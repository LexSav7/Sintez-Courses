package PalindromTestSuite;

import Palindrom.Palindrom;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class StringWithHTMLChars {
//
//    @BeforeClass
//    public static void beforeClass() {
//        System.out.println("With HTML Charset:");
//    }
//
//    @Parameterized.Parameter()
//    private boolean expOutput;
//    @Parameterized.Parameter(1)
//    private String input;
//
////    public StringWithHTMLChars(boolean expOutput, String input) {
////        this.expOutput = expOutput;
////        this.input = input;
////    }
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> testConditions() {
//        Object[][] parameters = {
//                {true, "olo&#32;olo"},
//                {true, "&#40;"},
//                {true, "olo&amp;olo"},
//                {false, "ololo &#40;"},
//                {false, "&#48; sdafljk"}
//        };
//        return Arrays.asList(parameters);
//    }
//
    @Test
    public void testWithHTMLCharset() {
//        assertEquals(expOutput, Palindrom.isStringPalindrom(input));
    }

}
