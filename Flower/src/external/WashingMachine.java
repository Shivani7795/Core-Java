package external;

import internal.Appliance;

public class WashingMachine implements Appliance {
    public void turnOn() {
        System.out.println("Washing Machine turned on.");
    }

    public void turnOff() {
        System.out.println("Washing Machine turned off.");
    }

    public void checkStatus() {
        System.out.println("Washing Machine is operational.");
    }
}







