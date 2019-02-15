package ExceptionHandling.perfomenceTesting;

import ExceptionHandling.TryCatch;
import ExceptionHandling.exceptions.CheckedException;
import ExceptionHandling.exceptions.UncheckedException;
import org.junit.Test;

public class TryCatchPerformance {

    @Test
    public void testMethodWithTryCatch() {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 50_000; i++) {

            try {
                TryCatch.methodWithTryCatch(4);
                System.out.print("It's OK");

            } catch (CheckedException e) {
//                System.out.printf("%s: Number is multiple of 2%n", e.getMessage());

            } catch (UncheckedException e) {
//                System.out.printf("%s: Number is multiple of 3%n", e.getMessage());

            } catch (Exception ignored) { }
        }

        long finish = System.currentTimeMillis();

        System.out.println("The result for try-catch in milliseconds is: " + (finish - start));
    }
}
