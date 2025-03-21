package wk09.cafe;

import wk09.order.Register;

import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Register r = new Register();
//
//        FancyCoffeeFactory fcf = new FancyCoffeeFactory();
//        Item fc = fcf.order(new Scanner(System.in));
//        System.out.println(fc.getReceiptEntry());
//        FancyCoffee fc1 = new FancyCoffee(new Money(5));
//        System.out.println(fc1);
//        fc1.add(new Syrup("Chocolate"));
//        fc1.add(new Syrup("Vanilla"));
//        fc1.add(new Syrup("Ranch"));
//        System.out.println(fc1.getTotalPrice());
//        System.out.println(fc1.getReceiptEntry());

//        Item fc2 = fc1;
//        fc2.add(new Syrup("Maple"));
//        fc1.add(new Syrup("Guacamole"));
//        System.out.println(fc1.getClass());
//        System.out.println(fc2.getClass());

//        System.out.println(fc1.getTotalPrice());
        // YAGNI
        // You Aren't Going to Need It
//        Item i1 = new FancyCoffee(new Money(5));
//        Item i2 = new Hotdog("Mini Hotdog", Money.ONE_DOLLAR);
//        Item i3 = new Coffee(Money.ONE_DOLLAR, "Tall");
//        System.out.println(i.getReceiptEntry());
//        ArrayList<Item> items = new ArrayList<>();
//        items.add(i1);
//        items.add(i2);
//        items.add(i3);
//        for(Item i: items) {
//        for(int k = 0; k < items.size(); k++) {
//            Item i = items.get(k);
//            System.out.println(i.getTotalPrice());
//            System.out.println("My class is: " + i.getClass());
//            System.out.println(i.foo());
//        }
//        CoffeeFactory cf = new CoffeeFactory();
//        Item i = cf.order(new Scanner(System.in));
//        System.out.println(i);
        r.addOrderable(new CoffeeFactory());
        r.addOrderable(new HotdogFactory());
        r.addOrderable(new FancyCoffeeFactory());
        r.order(new Scanner(System.in));
    }
}
