import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {
    public static void main(String[] args) {
        System.out.println("test");
    }

    @Test(timeout = 100)
    public void sum() throws InterruptedException {
        Thread.sleep(50);
        int actual = Numbers.sum(5);
        int expected = 15;
        assertEquals(actual, expected);
    }
}