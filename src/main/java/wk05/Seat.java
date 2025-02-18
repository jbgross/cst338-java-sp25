package wk05;

public abstract class Seat {

    private String name;
    public Seat(String name) {
        System.out.println("one true constructor");
        this.name = name;
    }

    public Seat() {
       // constructor delegation
        this("Generic Seat");
        System.out.println("no-parameter constructor");


    }

    public abstract void sit(Person p);

    public final void foo() {
        System.out.println("this is the foo method");
    }
}
