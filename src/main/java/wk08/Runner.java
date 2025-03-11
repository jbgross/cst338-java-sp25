package wk08;

public class Runner {

    public static void main(String[] args) {
        Book b1 = new Book("Farenheit 451", "Ray Bradbudy", 451);
        Receipt r1 = new Receipt();
        b1.print();
        r1.print();
    }
}
