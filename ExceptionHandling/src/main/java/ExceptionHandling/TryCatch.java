package ExceptionHandling;

import ExceptionHandling.exceptions.CheckedException;
import ExceptionHandling.exceptions.UncheckedException;

//Created by Alex Savenko on 04/13/2018

/**
 * Contains method which throws Checked or Unchecked exception.
 *
 * @author Alex Savenko
 * @version 1.0
 * @since 1.0
 */

public class TryCatch {

    /**
     * Throws the Checked or Unchecked exception if conditions are met. <br>
     * <br>
     * Prints a notification to console if all conditions have passed.
     *
     * @param a a value
     * @throws CheckedException- if param a is multiple of 2; <br>
     *         UncheckedException - if param a is multiple of 3. <br>
     */
    public static void methodWithTryCatch(int a) throws CheckedException, UncheckedException {

        if (a % 2 == 0) {
            throw new CheckedException();

        } else if (a % 3 == 0) {
            throw new UncheckedException();
        }

        System.out.println("Some logic here!");
    }
}
