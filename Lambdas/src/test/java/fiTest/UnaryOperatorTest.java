package fiTest;

import interfaces.UnaryOperator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UnaryOperatorTest {

    private Long expOutput;
    private long actual;

    public UnaryOperatorTest(Long expOutput, long actual) {
        this.expOutput = expOutput;
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection<Long[]> testConditions() {
        Long[][] numbers = {
            {0L, 0L},

            {1L, 1L},
            {(long) Math.pow((double) 100500, 3), 100500L},
            {(long) Math.pow((double) Long.MAX_VALUE, 3), Long.MAX_VALUE},

            {-1L, -1L},
            {(long) Math.pow((double) -100500, 3), -100500L},
            {(long) Math.pow((double) Long.MIN_VALUE, 3), Long.MIN_VALUE}
        };

        return Arrays.asList(numbers);
    }

    @Test
    public void testUnaryOperator() {
        assertEquals(expOutput, new UnaryOperator().cubeNumber(actual));
    }

}
