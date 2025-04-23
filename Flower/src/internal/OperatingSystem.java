package internal;

public interface OperatingSystem {
    void boot();
    void execute();
    void update();
    void shutdown();
    void restart();
}
