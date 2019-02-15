//Created by Alex Savenko on 03/30/2018

/**
 * Class illustrates the work of the double type with precise money operations.
 * @author Alex Savenko
 * @version 1.0
 * @since 1.0
 */

public class WithDouble {

    /**
     * Function shows the quantity of purchased goods along with the change left.
     * There is already a fixed amount of funds (1.00) and price of the product (.10)
     * With every cycle iteration the price will be increased by .10.
     *
     * This function outputs incorrect information due to the specificity of double type work with precise calculations.
     * Use of BigDecimal is recommended insted.
     *
     * @deprecated
     * @see WithBigDecimal#purchaseGoods()
     */

    public static void purchaseGoods() {
        double funds = 1.00;
        int itemsBought = 0;

        for (double price = .10; funds >= price; price += .10) {
            funds -= price;
            itemsBought++;
        }

        System.out.printf("%d bought items. Change: $%.2f", itemsBought, funds);
    }
}
