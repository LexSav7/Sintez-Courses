package PalindromTestSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({BasicScenarios.class, StringWithDigits.class, IgnoringCases.class, EmptyString.class,
                     IgnoringNonWordCharacters.class, CombinedScenarios.class, StringWithOneChar.class, StringWithHTMLChars.class})

public class TestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing the palindrome function ...");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Testing has been completed !");
    }
}
