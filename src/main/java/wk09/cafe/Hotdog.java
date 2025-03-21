package wk09.cafe;

import wk09.order.Item;
import wk09.order.Money;

public class Hotdog extends Item {
    public Hotdog(String type, Money basePrice) {
        super(type + " Hot Dog", basePrice);
    }


    public String getReceiptEntry() {
        return this.getName() + this.getTotalPrice() + "\n";
    }

    public String toString() {
        return this.getReceiptEntry();
    }

    public String foo() {
        return "foo";
    }
}
