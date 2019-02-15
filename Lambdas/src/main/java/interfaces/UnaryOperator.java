package interfaces;

public class UnaryOperator {

    // UnaryOperator<T> interface realization
    public Long cubeNumber(long a) {
        java.util.function.UnaryOperator<Long> cubeNumber = x ->  (long) Math.pow((double) x, 3);
        return cubeNumber.apply(a);
    }
}
