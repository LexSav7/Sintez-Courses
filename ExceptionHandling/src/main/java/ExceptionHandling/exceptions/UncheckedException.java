package ExceptionHandling.exceptions;

//Created by Alex Savenko on 04/13/2018

/**
 * Thrown when parameter in methodWithTryCatch(int a) is multiple of 3.
 *
 * @author Alex Savenko
 * @version 1.0
 * @since 1.0
 */

public class UncheckedException extends RuntimeException {

    public UncheckedException() {
        super("Unchecked Exception");
    }

}
