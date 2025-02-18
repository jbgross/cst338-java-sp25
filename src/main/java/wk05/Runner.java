package wk05;

public class Runner {
    public static void main(String[] args) {
//        Seat s = new Seat();
        Chair c1 = new Chair();
        Couch c2 = new Couch();
        c2.sit(new Person());
        c2.sit(new Person());
        c2.sit(new Person());
        c2.sit(new Person());
        c2.sit(new Person());

        Seat s1 = new Chair();
        s1.sit(new Person());
        s1 = new Couch();
        s1.sit(new Person());
    }
}
