package interfaces;

public class Function {

    // Function<T, R> interface realization
    public Double castIntToDouble(int a) {
        java.util.function.Function<Integer, Double> cast = Double::valueOf;
        return cast.apply(a);
    }
}
