package ExceptionHandling;

//Created by Alex Savenko on 04/13/2018

/**
 * Contains method which returns codes of the function.
 *
 * @author Alex Savenko
 * @version 1.0
 * @since 1.0
 */

public class ReturnCodes {

    /**
     * Returns the codes notifying about status of the function. <br>
     *  <br>
     *  0 - if passed all conditions; <br>
     * -1 - if param a is multiple of 2; <br>
     * -2 - if param a is multiple of 3.
     *
     * @param a a value
     * @return codes 0, -1, -2
     */
    public static int methodWithReturnCodes(int a) {

        if (a % 2 == 0) {
            return -1;

        } else if (a % 3 == 0) {
            return -2;
        }

        System.out.println("Some logic here!");
        return 0;
    }
}
