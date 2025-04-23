package external;

import internal.Vehicle;

public class Cars implements Vehicle {
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    public void checkFuel() {
        System.out.println("Car fuel level checked.");
    }
}
