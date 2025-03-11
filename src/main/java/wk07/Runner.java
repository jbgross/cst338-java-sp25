package wk07;

import wk07.drinks.BeverageContainer;
import wk07.drinks.Mug;
import wk07.drinks.WaterBottle;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
//        BeverageContainer bc1 = new BeverageContainer();
        Mug m1 = new Mug();
        m1.fillContainer(10);
        BeverageContainer bc2 = new WaterBottle();
//        bc2.uncap();
        ArrayList<BeverageContainer> drinks = new ArrayList<>();
        drinks.add(new Mug());
        drinks.add(new WaterBottle());

        for(BeverageContainer bc : drinks){
            bc.fillContainer(5);
            System.out.println(bc.getSize());
            if(bc instanceof WaterBottle) {
                WaterBottle wb = (WaterBottle) bc;
                wb.uncap();
            }
        }
    }
}
