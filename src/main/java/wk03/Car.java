package wk03;

public class Car {

    private Engine engine;

    public Car() {
        this.engine = new Engine(4);
        System.out.println(this.engine.toString());
    }

    public void turnOn() {
        engine.turnOn();
    }
}
