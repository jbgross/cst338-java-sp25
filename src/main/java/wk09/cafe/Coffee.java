package wk09.cafe;
import wk09.order.Item;
import wk09.order.Money;

public class Coffee extends Item {

    private String size;
    public Coffee(Money basePrice, String size) {
        super("Regular Coffee", basePrice);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getReceiptEntry() {
        return this.getSize() + " " + this.getName() + " "
                + this.getTotalPrice() + "\n";
    }

    public String toString() {
//        return this.getName() + " " + this.getBasePrice();
        return getReceiptEntry();
    }
}
