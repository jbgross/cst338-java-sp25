package wk01;

public class Car {
    private String currentGear;
    private int gasUnits;
    private boolean isRunning;
    private double speedMeterPerSecond;

    public Car() {
//        System.out.println("I'm the constructor!");
//        System.out.println("gasUnits = " + gasUnits);
//        System.out.println("isRunning = " + isRunning);
//        System.out.println("speedMeterPerSecond = " + speedMeterPerSecond);
//        System.out.println("currentGear = " + currentGear);
        speedMeterPerSecond = 0.0;
        isRunning = false;
        gasUnits = 0;
        currentGear = "Park";
    }


    public void changeRunningStatus() {
//        isRunning = ! isRunning;
//        if(isRunning) {
//            changeRunningStatus(false);
//        } else {
//            changeRunningStatus(true);
//        }
        changeRunningStatus(! isRunning);
    }

    public double getSpeedMeterPerSecond() {
        return speedMeterPerSecond;
    }

    public void changeRunningStatus(boolean newStatus) {
        if(newStatus) {
            isRunning = true;
        } else {
            isRunning = false;
            speedMeterPerSecond = 0;
        }
    }

    public void accelerate() {
        // if the car isn't currently running, accelerate
        // shouldn't change the car's speed
        if(isRunning) {
            speedMeterPerSecond += 10;
        }
    }

    @Override
    public String toString() {
        return "currentGear: " + currentGear
                + " gas: " + gasUnits
                + " isRunning: " + isRunning
                + " speed (mps): " + speedMeterPerSecond;
    }
}
