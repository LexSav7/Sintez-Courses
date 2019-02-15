package fiTest;

import interfaces.Predicate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PredicateTest {

    private boolean expOutput;
    private int input;

    public PredicateTest(boolean expected, int input) {
        this.expOutput = expected;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        Object[][] parameters = {
                {true, 0},

                {false, 1},
                {true, 100500},
                {false, Integer.MAX_VALUE},

                {false, -1},
                {true, -100500},
                {true, Integer.MIN_VALUE}
        };

        return Arrays.asList(parameters);
    }

    @Test
    public void testPredicateMethod() {
        assertEquals(expOutput, new Predicate().isEven(input));
    }

}
