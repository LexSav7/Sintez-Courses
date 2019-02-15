package ExceptionHandling.perfomenceTesting;

import org.junit.Test;

import static ExceptionHandling.ReturnCodes.methodWithReturnCodes;

public class ReturnCodesPerformance {

    @Test
    public void testMethodWithReturnCodes() {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 50_000; i++) {
            switch (methodWithReturnCodes(4)) {

                case 0:
//                    System.out.println("It's OK");
                    break;

                case -1:
//                    System.out.println("Number is multiple of 2");
                    break;

                case -2:
//                    System.out.println("Number is multiple of 3");
                    break;
            }
        }

        long finish = System.currentTimeMillis();

        System.out.println("The result for return codes in milliseconds is: " + (finish - start));
    }
}
