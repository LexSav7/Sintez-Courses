package ArraysMaxSize;

import java.util.Arrays;

public class StringMaxSize {

    public static void main(String[] args) {
//        System.out.println("Final Answer: " + getStringMaxSize());
        String string = new String(new char[1383071728]);
    }

    public static int getStringMaxSize() {
        int low = 0;
        int mid = -1;
        int high = Integer.MAX_VALUE;

        while (low <= high) {
            mid = (low + high) >>> 1;
            System.out.printf("%s : %s : %s%n", low, mid, high);

            try {
                String string = new String(new char[mid]);
                low = mid + 1;
            } catch (OutOfMemoryError e) {
                high = mid - 1;
            }

        }

        return mid;
    }
}
