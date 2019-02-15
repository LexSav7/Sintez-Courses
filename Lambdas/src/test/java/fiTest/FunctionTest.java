package fiTest;

import interfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FunctionTest {

    private Double expOutput;
    private int input;

    public FunctionTest(Double expOutput, int input) {
        this.expOutput = expOutput;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Number[]> testConditions() {
        Number[][] numbers = {
            {(double) 0, 0},

            {(double) 1, 1},
            {(double) 100500, 100500},
            {(double) Integer.MAX_VALUE, Integer.MAX_VALUE},

            {(double) -1, -1},
            {(double) -100500, -100500},
            {(double) Integer.MIN_VALUE, Integer.MIN_VALUE}
        };

        return Arrays.asList(numbers);
    }

    @Test
    public void testFunction() {
        assertEquals(expOutput, new Function().castIntToDouble(input));
    }

}
