package wk01;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c = new Car();
        System.out.println(c);
        c.changeRunningStatus(true);
        System.out.println(c.getSpeedMeterPerSecond());
        c.accelerate();
//        double speed = c.getSpeedMeterPerSecond();
        while(c.getSpeedMeterPerSecond() < 75) {
            c.accelerate();
        }
        System.out.println(c.getSpeedMeterPerSecond());

        int [] a = new int[5];
        a[1] = 3;
        a[3] = a[1] * 2;
        for(int i = 0; i < a.length; i++) {
            System.out.println(i + ": " + a[i]);
        }

        ArrayList<String> al = new ArrayList<>();
        System.out.println(al.size());
        al.add("foo");
        al.add("bar");
        al.add("grault");

        for(String s : al) {
            System.out.println(s);
        }

//        System.out.println(c);
//        c.changeRunningStatus();
//        c.accelerate();
//        System.out.println(c);
    }
}