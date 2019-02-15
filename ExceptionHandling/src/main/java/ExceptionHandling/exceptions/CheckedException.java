package ExceptionHandling.exceptions;

//Created by Alex Savenko on 04/13/2018

/**
 * Thrown when parameter in methodWithTryCatch(int a) is multiple of 2.
 *
 * @author Alex Savenko
 * @version 1.0
 * @since 1.0
 */

public class CheckedException extends Exception {

    public CheckedException() {
        super("Checked Exception");
    }
}
