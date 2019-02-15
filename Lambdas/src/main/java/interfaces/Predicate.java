package interfaces;

public class Predicate {

    // Predicate<T> interface realization
    public boolean isEven(int a) {
        java.util.function.Predicate<Integer> isEven = x -> (x % 2 == 0);
        return isEven.test(a);
    }
}
