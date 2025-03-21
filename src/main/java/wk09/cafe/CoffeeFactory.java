package wk09.cafe;

import wk09.order.Item;
import wk09.order.ItemFactory;
import wk09.order.Money;

import java.util.Scanner;

public class CoffeeFactory extends ItemFactory {
    private static final String [] sizes = {"Small", "Medium", "Large"};
    private static final Money [] prices = {new Money(1.5), new Money(2.5), new Money(3.75)};
    public CoffeeFactory() {
        super("Coffee");
    }

    public Item order(Scanner in) {
        int selection;
        do {
            for (int i = 0; i < sizes.length; i++) {
                System.out.println(i + " - " + sizes[i] + " " + prices[i]);
            }
            System.out.print("What do you want? ");
            selection = in.nextInt();
            System.out.println();
        }while(selection < 0 || selection >= sizes.length);
        return new Coffee(prices[selection], sizes[selection]);
    }
}
