package fiTest;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayInputStream;

public abstract class InputTest {

    protected final ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[1024 * 8]);

    @Before
    public void setUpStreams() {
        System.setIn(inputStream);
    }

    @After
    public void cleanUpStream() {
        System.setIn(null);
    }
}
