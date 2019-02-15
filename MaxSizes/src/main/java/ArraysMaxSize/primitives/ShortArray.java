package ArraysMaxSize.primitives;

//Created by Alex Savenko on 04/04/2018

/**
 * Contains a method to calculate the maximum size of primitive type short array.
 * Size depends on particular PC and JVM configuration.
 * @author Alex Savenko
 * @version 1.0
 * @since 1.0
 */

public class ShortArray {

    /**
     * Returns the maximum size of a primitive type short array (short[]) available on this PC and JVM configuration.
     *
     * @return Maximum size of an primitive type short array
     */

    public static int getShortArrayMaxSize() {
        int low = 0;
        int mid = -1;
        int high = Integer.MAX_VALUE;

        while (low <= high) {
            mid = (low + high) >>> 1;

            try {
                short[] shorts = new short[mid];
                low = mid + 1;
            } catch (OutOfMemoryError e) {
                high = mid - 1;
            }

            System.gc();
        }

        return mid;
    }

}
