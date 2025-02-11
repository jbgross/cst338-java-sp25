package wk04;

public class Car extends MotorVehicle {

    public Car(String name) {
        super(name);
    }



    @Override
    public String toString() {
        return "I'm a car; am I moving? " + isMoving();
    }
}
