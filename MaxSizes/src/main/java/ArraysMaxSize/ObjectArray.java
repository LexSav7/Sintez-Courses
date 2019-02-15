package ArraysMaxSize;

//Created by Alex Savenko on 04/04/2018

/**
 * Contains method to calculate the maximum size of an object array.
 * Size depends on particular PC and JVM configuration.
 * The maximum size of Object[] will be the same as for any other object type.
 *
 * @author Alex Savenko
 * @version 1.0
 * @since 1.0
 */

public class ObjectArray {

    /**
     * Returns the maximum size of an object array (Object[]) available on this PC and JVM configuration.
     * The maximum size of Object[] will be the same as for any other object type
     * (e.g. Integer[], String[], Float[]).
     *
     * @return Maximum size of an object array
     */

    public static int getObjectArrayMaxSize() {
        int low = 0;
        int mid = -1;
        int high = Integer.MAX_VALUE;

        while (low <= high) {
            mid = (low + high) >>> 1;

            try {
                Object[] objects = new Object[mid];
                low = mid + 1;
            } catch (OutOfMemoryError e) {
                high = mid - 1;
            }

        }

        return mid;
    }

}



