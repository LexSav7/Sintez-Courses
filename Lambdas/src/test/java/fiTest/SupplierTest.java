package fiTest;

import fiTest.InputTest;
import interfaces.Supplier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SupplierTest extends InputTest {

    private String expOutput;
    private String input;

    public SupplierTest(String expOutput, String input) {
        this.expOutput = expOutput;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String[][] strings = {
            {"", ""},
            {" ", " "},

            {"a", "a"},
            {"Test", "Test"},

            {"TEST", "TEST"},
            {"test", "test"},

            {"12345", "12345"},
            {"Test12345", "Test12345"},

            {"!@#$%^&*", "!@#$%^&*"},
            {"Test!@#$%^&*", "Test!@#$%^&*"},

            {"TeSt!@#1234 ", "TeSt!@#1234 "}
        };

        return Arrays.asList(strings);
    }

    @Test
    public void testSupplier() {
        try {
            System.in.read(input.getBytes("UTF-8")) ;
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(expOutput, new Supplier().getString());
    }
}
