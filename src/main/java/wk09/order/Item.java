package wk09.order;

/**
 * Abstract superclass for all Item classes that can be added to a receipt
 */
public abstract class Item {
    /**
     * The name of the item (e.g., Coffee, Hamburger)
     */
    private final String name;

    /**
     * The base price of the item (so without additions)
     */
    private final Money basePrice;

    /**
     * Construct a new Item, specifying a name (e.g., Coffee, Ham
     * Sandwich) and a base price (so the price for an item without
     * additions)
     * @param name the name of the item
     * @param basePrice its base price (without additions)
     */
    public Item(String name, Money basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    /**
     * Get a string containing the line or lines to add
     * to the receipt for this item
     * @return a String to add to the receipt
     */
    public abstract String getReceiptEntry();

    /**
     * Get the base price for the item. If the item is simple
     * (has no additions), the base price and the total price s
     * should be the same
     * @return the base price for the item
     */
    public Money getBasePrice() {
        return this.basePrice;
    }

    /**
     * Return the total price of the item, with any additions. The
     * default behavior is to return the base price
     * @return the total price
     */
    public Money getTotalPrice(){
        return this.getBasePrice();
    }

    /**
     * Get the name for the item (e.g., Coffee, Ham Sandwich)
     * @return the name for the item
     */
    public String getName() {
        return this.name;
    }

}
