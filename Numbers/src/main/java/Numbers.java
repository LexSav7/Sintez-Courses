import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        System.out.println(findIndex(new int[] {1, 2, 3, 55, 78, 6}));
    }

    public static int findIndex(int[] array) {
        while (true) {
            int count = 1;
            int startSum = array[0] + array[1];
            for (int i = count+2; i < array.length; i++) {
                if (startSum == array[i]) return i;
            }
            startSum += startSum + array[++count];
        }


    }
}
