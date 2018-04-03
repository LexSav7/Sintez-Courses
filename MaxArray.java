package ArraysMaxSize;



public class MaxArray {
    public static void main(String[] args) {
        System.out.println("FINAL ANSWER : " + arrayMaxSize());
    }

    static int c = Integer.MAX_VALUE - 2;
    static int d = 100_000_000;

    public static int arrayMaxSize() {
        while (true) {
            if (d == 100) {
                System.out.println("FINAL LAP");
                for (int i = c; i >= c - d; i--) {
                    System.out.println(i);
                    try {
                        ints = new int[i];
                        return i;
                    } catch (OutOfMemoryError e) { }
                }
            }

            for (int i = c; i >= 0; i -= d) {
                try {
                    System.out.println(i);
                    int[] ints = new int[i];
                    System.gc();
                    System.out.println("POINT : " + i);
                    System.out.println("DELTA : " + d);
                    c = i + d;
                    d /= 100;
                    break;
                } catch (OutOfMemoryError e) { }
            }
        }
    }

}

// Recursion method - overloads stack memory (seems to be)
//
//    public static int arrayMaxSize() {
//
//        if (d == 100) {
//            for (int i = c; ; i--) {
//                try {
//                    System.out.println(c);
//
//                    int[] ints = new int[c];
//                    return c;
//                } catch (OutOfMemoryError e) {
//                }
//            }
//        }
//
//        while (true) {
//            try {
//                System.out.println(c);
//                int[] ints = new int[c];
//                c += d;
//                d /= 10;
//                arrayMaxSize();
//            } catch (OutOfMemoryError e) {
//                c -= d;
//            }
//        }
//
//    }

