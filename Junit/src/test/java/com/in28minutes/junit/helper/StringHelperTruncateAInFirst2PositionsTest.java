package com.in28minutes.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperTruncateAInFirst2PositionsTest {
    StringHelper helper = new StringHelper();

    private String input;
    private String expOutput;

    public StringHelperTruncateAInFirst2PositionsTest(String input, String expOutput) {
        this.input = input;
        this.expOutput = expOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String[][] parameters = {
                {"AACD", "CD"},
                {"ACD", "CD"}
        };
        return Arrays.asList(parameters);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(expOutput, helper.truncateAInFirst2Positions(input));
    }
}
