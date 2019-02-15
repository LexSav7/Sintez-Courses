import java.math.BigDecimal;

//Created by Alex Savenko on 03/30/2018

/**
 * Class illustrates the work of the BigDecimal type with precise money operations.
 * @author Alex Savenko
 * @version 1.0
 * @since 1.0
 */
public class WithBigDecimal {

    /**
     * Function shows the quantity of purchased goods along with the change left.
     * There is already a fixed amount of funds (1.00) and price of the product (.10)
     * With every cycle iteration the price will be increased by .10.
     */
    public static void purchaseGoods() {

        final BigDecimal TEN_CENTS = new BigDecimal(".10");
        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");

        for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
            itemsBought++;
            funds = funds.subtract(price);
        }

        System.out.printf("%d bought items. Money left over: $%.2f", itemsBought, funds);
    }
}
