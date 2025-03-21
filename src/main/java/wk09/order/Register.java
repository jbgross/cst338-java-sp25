package wk09.order;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class will store a list of types of orderable items, as a set of instances of
 * ItemFactory subclasses. It will then allow the user to order multiple items.
 */
public class Register {
    private final Order order = new Order();
    private final ArrayList<ItemFactory> orderables = new ArrayList<>();

    /**
     * Add a factory for something that can be ordered. It must
     * extend the ItemFactory class
     * @param factory an instance of the ItemFactory for the specific item
     */
    public void addOrderable(ItemFactory factory) {
        orderables.add(factory);
    }

    /**
     * Interactively use a Scanner to build an order. Until the user selects to end the
     * order, this method will prompt the user, giving them a list of orderable item
     * types. When the user selects one, this method will hand off control to the
     * correct ItemFactory's order() method.
     * All interactions should be integers, from 0 to the highest correct value
     * @param in a Scanner connected to System.in or a file
     */
    public void order(Scanner in) {
        int selection;
        int i = 0;
        do {
            System.out.println("Options: ");

            //print options
            for(i = 0; i < orderables.size(); i++) {
                System.out.println("\t" + i + " - " + orderables.get(i).getName());
            }

            // last option should be to stop
            System.out.println("\t" + i  + " - Finish");
            System.out.print("Enter your selection: ");
            selection = in.nextInt();
            System.out.println();
            // verify that option selected is in valid range

            if(selection >= 0 && selection < i) {
                // run the order process and add result to the Order
                order.add(orderables.get(selection).order(in));
            }

            // finally, stop when the selected option is out of range
        } while(selection >= 0 && selection < i);

        System.out.println(order.prepareReceipt());
        System.out.println(order.getTotalString());
    }

    /**
     * Get the current order for the register
     * @return the current Order object
     */
    public Order getOrder() {
        return this.order;
    }



}
