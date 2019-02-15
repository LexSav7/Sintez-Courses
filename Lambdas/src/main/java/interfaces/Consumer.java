package interfaces;

public class Consumer {

    // Consumer<T> interface realization
    public void print(double a) {
        java.util.function.Consumer<Double> print = x -> System.out.printf("This is testing : %f%n", x);
        print.accept(a);
    }
}
