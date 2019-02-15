package fiTest;

import interfaces.BinaryOperator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BinaryOperatorTest {

    private Integer expOutput;
    private int a;
    private int b;

    public BinaryOperatorTest(Integer expOutput, int a, int b) {
        this.expOutput = expOutput;
        this.a = a;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> testConditions() {
        Integer[][] integers = {
            {(10 - 5), 10, 5},
            {100500 - 12345, 100500, 12345},
            {Integer.MAX_VALUE - 123456789, Integer.MAX_VALUE, 123456789},

            {(-10) - (-5), -10, -5},
            {(-100500) - (-12345), -100500, -12345},
            {Integer.MIN_VALUE - (-123456789), Integer.MIN_VALUE, -123456789},

            {0, 1, 1},
            {0, 100500, 100500},
            {-1, Integer.MAX_VALUE, Integer.MIN_VALUE}
//                {10, 5},
//                {100500, 12345}
        };

        return Arrays.asList(integers);
    }

    @Test
    public void testSubstract() {
        assertEquals(expOutput, new BinaryOperator().substract(a, b));
    }
}
