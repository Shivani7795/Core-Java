package external;
import internal.MusicalInstrument;

public class Piano implements MusicalInstrument {
    public void play() {
        System.out.println("Piano is playing.");
    }
    public void tune() {
        System.out.println("Piano is being tuned.");
    }
    public void stop() {
        System.out.println("Piano has stopped playing.");
    }
    public void adjustVolume() {
        System.out.println("Piano volume adjusted.");
    }
    public void changeTone() {
        System.out.println("Piano tone changed.");
    }
    public void repair() {
        System.out.println("Piano is being repaired.");
    }
    public void clean() {
        System.out.println("Piano is being cleaned.");
    }
}








