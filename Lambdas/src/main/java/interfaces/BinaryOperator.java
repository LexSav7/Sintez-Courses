package interfaces;


public class BinaryOperator {

    public static final    java.util.function.BinaryOperator<Integer> substract = (x, y) -> (x - y);
    // BinaryOperator<T> interface realization
    public Integer substract(int a, int b) {
        return substract.apply(a, b);
    }
}
