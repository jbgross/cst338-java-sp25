package wk09.cafe;

import wk09.order.Item;
import wk09.order.ItemFactory;
import wk09.order.Money;

import java.util.Scanner;

public class HotdogFactory extends ItemFactory {
    public HotdogFactory() {
        super("Hotdog");
    }

    public Item order(Scanner in) {
        System.out.print("Regular (0) or Footlong (1)? ");
        int input = in.nextInt();
        if(input == 0) {
            return new Hotdog("Regular", new Money(3));
        } else {
            return new Hotdog("Footlong", new Money(5.23));
        }
    }
}
