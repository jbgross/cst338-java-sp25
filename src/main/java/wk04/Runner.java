package wk04;

public class Runner {
    public static void main(String[] args) {
        Car c1 = new Car("Mazda");
        System.out.println(c1.isMoving());
        c1.drive();
        System.out.println(c1.isMoving());
    }
}
