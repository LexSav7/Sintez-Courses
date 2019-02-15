package ExceptionHandling;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ReturnCodesTest {

    private int expOutput;
    private int input;

    public ReturnCodesTest(int expOutput, int input) {
        this.expOutput = expOutput;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> testConditions() {
        Integer[][] parameters = {
                {-1, 0},

                {0, 1},
                {-1, 2},
                {-2, 3},
                {-2, 33},
                {-1, 100},
                {-1, 102},
                {0, Integer.MAX_VALUE},

                {-1, -2},
                {-2, -3},
                {-2, 33},
                {-1, 100},
                {-1, 102},
                {-1, Integer.MIN_VALUE}

        };
        return Arrays.asList(parameters);
    }

    @Test
    public void testMethodWithReturnCodes() {
        assertEquals(expOutput, ReturnCodes.methodWithReturnCodes(input));
    }
}
