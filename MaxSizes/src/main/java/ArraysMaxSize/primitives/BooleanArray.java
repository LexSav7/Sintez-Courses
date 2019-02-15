package ArraysMaxSize.primitives;

/**
 * Contains method to calculate the maximum size of primitive type byte array.
 * Size depends on particular PC and JVM configuration.
 * Default size equals Integer.MAX_VALUE - 2 or at least Integer.MAX_VALUE - 8.
 *
 * @author Alex Savenko
 * @version 1.0
 * @since 1.0
 */

public class BooleanArray {

    /**
     * Returns the maximum size of a primitive type boolean array (boolean[]) available on this PC and JVM configuration.
     * Checks the range between Integer.MAX_VALUE - 2 and Integer.MAX_VALUE - 8.
     * This is the most common maximum sizes for this type of array.
     *
     * @return Maximum size of a primitive type boolean array
     */

    public static int getBooleanArrayMaxSize() {
        int result = -1;

        for (int i = Integer.MAX_VALUE - 2; i >= Integer.MAX_VALUE - 8; i--) {
            try {
                boolean[] booleans = new boolean[i];
                result = i;
                break;
            } catch (OutOfMemoryError e) { }
        }

        return result;
    }
}
