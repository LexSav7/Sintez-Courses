import org.junit.Test;
import static org.junit.Assert.*;

public class WithDoubleTest extends OutputTest {

    @Test
    public void testPurchaseGoods_Double(){
        WithDouble.purchaseGoods();
        assertNotEquals("4 items bought. Change: $0.00", output.toString());
    }
}
