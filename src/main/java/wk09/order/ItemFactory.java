package wk09.order;

import java.util.Scanner;

/**
 * Abstract superclass for classes that generate Item objects
 * to be added to a receipt
 */
public abstract class ItemFactory {
    /**
     * The name of the Item type (e.g., "Coffee", "Ham Sandwich")
     */
    private final String name;

    /**
     * Constructor takes on parameter, the name of the item
     * @param name the name of the item (e.g., "Coffee", "Ham Sandwich")
     */
    public ItemFactory(String name) {
        this.name = name;
    }

    /**
     * Interactively generate an order by printing to STDOUT (System.out)
     * and reading in data from the Scanner object passed in. The Scanner
     * can reference System.in for a truly interactive system, or it
     * can read from a file. All inputs should be integers selecting options, 0 to
     * whatever the appropriate limit is. Therefore, the text file should just
     * be integers.
     * @param in the Scanner to read from, pointing to System.in or a text file
     * @return a new Item of the appropriate type to add to the Receipt
     */
    public abstract Item order(Scanner in);

    /**
     * Get the name of the Item type that can be constructed.
     * @return the Item type's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the Item type's name as the object's string version
     * @return the Item type's name (so CoffeeFactory)
     */
    @Override
    public String toString() {
        return this.getName();
    }
}
