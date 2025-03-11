package wk08;

import java.util.ArrayList;

public class Receipt implements Printable {
    private ArrayList<Double> prices = new ArrayList<>();
    private ArrayList<String> items = new ArrayList<>();

    public Receipt() {

    }

    public void addItem(String itemName, double price) {
        prices.add(price);
        items.add(itemName);
    }

    public void print() {
        System.out.println("I'm a receipt");
    }
}
