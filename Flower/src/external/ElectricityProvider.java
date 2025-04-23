package external;

import internal.Service;

public class ElectricityProvider implements Service {
    public void provideService() {
        System.out.println("ElectricityProvider: Provides power to households and businesses.");
    }
}
