package ArraysMaxSize.primitives;

//Created by Alex Savenko on 04/04/2018

/**
 * Contains method to calculate the maximum size of primitive type double array.
 * Size depends on particular PC and JVM configuration.
 *
 * @author Alex Savenko
 * @version 1.0
 * @since 1.0
 */

public class DoubleArray {

    /**
     * Returns the maximum size of a primitive type double array (double[]) available on this PC and JVM configuration.
     *
     * @return Maximum size of an primitive type double array
     */

    public static int getDoubleArrayMaxSize() {
        int low = 0;
        int mid = -1;
        int high = Integer.MAX_VALUE;

        while (low <= high) {
            mid = (low + high) >>> 1;

            try {
                double[] doubles = new double[mid];
                low = mid + 1;
            } catch (OutOfMemoryError e) {
                high = mid - 1;
            }

        }

        return mid;
    }

}
