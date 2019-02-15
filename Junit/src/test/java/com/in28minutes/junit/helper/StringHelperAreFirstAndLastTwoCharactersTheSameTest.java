package com.in28minutes.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperAreFirstAndLastTwoCharactersTheSameTest {
    StringHelper helper = new StringHelper();

    private boolean expOutput;
    private String input;

    public StringHelperAreFirstAndLastTwoCharactersTheSameTest(boolean expOutput, String input) {
        this.expOutput = expOutput;
        this.input = input;
    }

    @Parameters
    public static Collection<Object[]> testConditions() {
        Object[][] parameters = {
                {false, "A"},
                {true, "AB"},
                {false, "ABCD"},
                {true, ".fRas4!324fR.f"}
        };
        return Arrays.asList(parameters);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame() {
        assertEquals(expOutput, helper.areFirstAndLastTwoCharactersTheSame(input));
    }
}
