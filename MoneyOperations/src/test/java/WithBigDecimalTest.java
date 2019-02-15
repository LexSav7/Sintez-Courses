import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class WithBigDecimalTest extends OutputTest {

    @Test
    public void testPurchaseGoods_BigDecimal(){
        WithBigDecimal.purchaseGoods();
        assertEquals("4 bought items. Money left over: $0.00", output.toString());
    }

}
