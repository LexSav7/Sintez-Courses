package df;

import java.util.function.Predicate;

public class NumberWithEvenDigitSum {

    public void printNumbersWithEvenDigitsSum(int[] array, Predicate<Integer> p) {
        for (int x : array) {
            if (p.test(x)) {
                System.out.println(x);
            }
        }
    }

}
