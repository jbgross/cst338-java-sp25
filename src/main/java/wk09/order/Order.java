
package wk09.order;
import java.util.ArrayList;
import java.util.List;

/**
 * This class stores and (eventually) prints a list of
 * the ordered items
 */
public class Order {
    /**
     * The list of items that were ordered
     */
    private final List<Item> items = new ArrayList<>();

    /**
     * Add a new Item to the order
     * @param i the item to add
     */
    public void add(Item i) {
        this.items.add(i);
    }

    /**
     * Return a (potentially multi-line) String version of the receipt
     * showing each ordered item and its price
     * @return a String version of the receipt
     */
    public String prepareReceipt() {
        StringBuilder st = new StringBuilder();

        for(Item i : this.items) {
            st.append(i.getReceiptEntry());
        }

        return st.toString();
    }

    /**
     * Get the total price for all of the Item objects in the
     * order (the sum of all of the Item objects in the order)
     * @return the total price
     */
    public Money getTotalPrice() {
        Money total = new Money(0);

        for(Item i : this.items) {
            total = total.add(i.getTotalPrice());
        }

        return total;
    }

    /**
     * The total price of the order in a String version
     * @return a String of the total price
     */
    public String getTotalString() {
        return "Total: " + this.getTotalPrice();
    }

}
