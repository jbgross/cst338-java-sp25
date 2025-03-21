package wk09.cafe;

import wk09.order.Item;
import wk09.order.Money;

public class Syrup extends Item {
    public Syrup(String flavor) {
        super(flavor + " Syrup", Money.ONE_DOLLAR);
    }

    @Override
    public String getReceiptEntry() {
        return "\t" + this.getName() + " " + this.getTotalPrice() + "\n";
    }
}
