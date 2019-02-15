package ExceptionHandling;

import ExceptionHandling.exceptions.CheckedException;
import ExceptionHandling.exceptions.UncheckedException;

//Created by Alex Savenko on 04/13/2018

/**
 * Main class of the application. Contains the main method which defines what way of handling the exceptions is faster:
 * return codes or try-catch blocks (used by default in Java).
 *
 * @author Alex Savenko
 * @version 1.0
 * @since 1.0
 */

public class Main {

    /**
     * Calculates which way of handling the exceptions is faster (return codes or try-catch blocks)
     * by running a for-cycle 50_000 times for each option and measuring the time needed for its performance in each case.
     * Prints to console the name of the fastest method and time separation in milliseconds.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 50_000; i++) {

            switch (ReturnCodes.methodWithReturnCodes(4)) {
                case 0:
                    System.out.println("It's OK");
                    break;
                case -1:
                    System.out.println("Number is multiple of 2");
                    break;
                case -2:
                    System.out.println("Number is multiple of 3");
                    break;
            }
        }
        long result1 = System.currentTimeMillis() - start1;
        System.out.println("\n\n\n");

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 50_000; i++) {

            try {
                TryCatch.methodWithTryCatch(4);
            } catch (CheckedException e) {
                System.out.println("Number is multiple of 2");
            } catch (UncheckedException e) {
                System.out.println("Number is multiple of 3");
            }
        }
        long result2 = System.currentTimeMillis() - start2;
        System.out.println("\n\n");

        System.out.println("Result with return codes in milliseconds: " + result1);
        System.out.println("Result with try-catch blocks in milliseconds: " + result2);

        String winner = (result1 < result2) ? "return codes" : "try-catch blocks";
        System.out.printf("The winner is %s up with %d milliseconds", winner, Math.abs(result1 - result2));
    }

}
