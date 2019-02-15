package fiTest;

import interfaces.Consumer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ConsumerTest extends OutputTest {

    private String expOutput;
    private double input;

    public ConsumerTest(String expOutput, double input) {
        this.expOutput = expOutput;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        Object[][] objects = {
            {String.format("This is testing : %f%n", (double) 0), (double) 0},

            {String.format("This is testing : %f%n", (double) 1), (double) 1},
            {String.format("This is testing : %f%n", (double) 100500), (double) 100500},
            {String.format("This is testing : %f%n", Double.MAX_VALUE), Double.MAX_VALUE},

            {String.format("This is testing : %f%n", (double) -1), (double) -1},
            {String.format("This is testing : %f%n", (double) -100500), (double) -100500},
            {String.format("This is testing : %f%n", Double.MIN_VALUE), Double.MIN_VALUE},
        };

        return Arrays.asList(objects);
    }

    @Test
    public void testConsumer() {
        new Consumer().print(input);
        Assert.assertEquals(expOutput, output.toString());
    }

}
