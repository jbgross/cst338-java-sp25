package wk04;

public class MotorVehicle {

    private boolean isMoving = false;
    private String name;
    public MotorVehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void drive() {
        System.out.println("I'm a vehicle and I'm driving");
        isMoving = true;
    }

    public boolean isMoving() {
        return isMoving;
    }
}
