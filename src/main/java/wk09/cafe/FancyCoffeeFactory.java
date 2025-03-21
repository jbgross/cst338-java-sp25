package wk09.cafe;


import wk09.order.Item;
import wk09.order.ItemFactory;
import wk09.order.Money;

import java.util.Scanner;

public class FancyCoffeeFactory extends ItemFactory {
    private final String [] syrupNames = {"Chocolate", "Vanilla", "Guacamole"};
    public FancyCoffeeFactory(){
        super("Fancy Coffee");
    }

    @Override
    public Item order(Scanner in) {
        FancyCoffee fc = new FancyCoffee(new Money(5));
        int selection;
        do {
            int i;
            for (i = 0; i < syrupNames.length; i++) {
                System.out.println("\t" + i + ". " + syrupNames[i]);
            }
            System.out.println(i + ". No more syrup");
            System.out.print("What syrup? ");
            selection = in.nextInt();
            if(selection >= 0 && selection < syrupNames.length) {
                fc.add(new Syrup(syrupNames[selection]));
            }
        } while(selection != syrupNames.length);
        return fc;
    }
}
