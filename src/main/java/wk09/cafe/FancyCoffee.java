package wk09.cafe;

import wk09.order.Item;
import wk09.order.Money;
import wk09.order.Order;

public class FancyCoffee extends Item {
//    private final ArrayList<Syrup> additions = new ArrayList<>();
    private final Order additions = new Order();
    public FancyCoffee(Money basePrice) {
        super("Fancy Coffee", basePrice);
    }

    public Money getTotalPrice() {
        Money subtotal = this.getBasePrice();
        subtotal = subtotal.add(additions.getTotalPrice());
        return subtotal;
    }

    public void add(Item i) {
        additions.add(i);
    }

    public String getReceiptEntry() {
        return this.getName() + " " + this.getBasePrice()
                + "\n" + additions.prepareReceipt();
    }

    @Override
    public String toString() {
        return this.getReceiptEntry();
    }
}
