package external;

import internal.OperatingSystem;

public class WindowsOS implements OperatingSystem {
    public void boot() {
        System.out.println("Windows OS is booting.");
    }

    public void execute() {
        System.out.println("Windows OS is executing programs.");
    }

    public void update() {
        System.out.println("Windows OS is updating.");
    }

    public void shutdown() {
        System.out.println("Windows OS is shutting down.");
    }

    public void restart() {
        System.out.println("Windows OS is restarting.");
    }
}
