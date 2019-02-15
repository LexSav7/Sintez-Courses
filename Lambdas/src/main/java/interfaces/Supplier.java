package interfaces;

import java.util.Scanner;

public class Supplier {

    // Supplier<T> interface realization
    public String getString() {
        java.util.function.Supplier<String> getString = () -> {
            try (Scanner in = new Scanner(System.in)) {
                return in.nextLine();
            }
        };

        return getString.get();
    }
}
