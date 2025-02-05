package wk03;

public class Engine {
    private int numberOfCylinders;

    public Engine(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public void turnOn() {
        System.out.println("vroom vroom");
    }
}
