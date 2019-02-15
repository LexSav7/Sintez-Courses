package dfTest;

import df.ExpressionHelper;
import df.NumberWithEvenDigitSum;
import org.junit.Test;

public class NumbersWithEvenDigitSumTest {

    @Test
    public void testPrintNumbersWithEvenDigitsSum() {
        int[] ints = {
            0,
            1, 100500, Integer.MAX_VALUE,
            -1, -100500, Integer.MIN_VALUE
        };

        new NumberWithEvenDigitSum().printNumbersWithEvenDigitsSum(ints, new ExpressionHelper() :: isSumEven);
    }
}
