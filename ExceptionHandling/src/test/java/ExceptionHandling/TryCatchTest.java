package ExceptionHandling;

import ExceptionHandling.exceptions.CheckedException;
import ExceptionHandling.exceptions.UncheckedException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TryCatchTest {

    private String expOutput;
    private int input;

    public TryCatchTest(String expOutput, int input) {
        this.expOutput = expOutput;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        Object[][] parameters = {
//                {0, 0},
//
//                {0, 1},
                {CheckedException.class.getSimpleName(), 2},
                {UncheckedException.class.getSimpleName(), 3},
                {UncheckedException.class.getSimpleName(), 33},
                {CheckedException.class.getSimpleName(), 100},
                {CheckedException.class.getSimpleName(), 102},
//                {0, Integer.MAX_VALUE},

                {CheckedException.class.getSimpleName(), -2},
                {UncheckedException.class.getSimpleName(), -3},
                {UncheckedException.class.getSimpleName(), 33},
                {CheckedException.class.getSimpleName(), 100},
                {CheckedException.class.getSimpleName(), 102},
                {CheckedException.class.getSimpleName(), Integer.MIN_VALUE}

        };
        return Arrays.asList(parameters);
    }

    @Test
    public void testMethodWithTryCatch() {
        try {
            TryCatch.methodWithTryCatch(input);
        } catch (Exception e) {
            assertEquals(expOutput, e.getClass().getSimpleName());
        }
    }
}

