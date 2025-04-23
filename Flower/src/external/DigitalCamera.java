package external;

import internal.Camera;

public class DigitalCamera implements Camera {
    public void capturePhoto() {
        System.out.println("Photo captured with Digital Camera.");
    }
    public void recordVideo() {
        System.out.println("Video recorded with Digital Camera.");
    }
    public void adjustFocus() {
        System.out.println("Focus adjusted on Digital Camera.");
    }
    public void changeResolution() {
        System.out.println("Resolution changed on Digital Camera.");
    }
    public void zoomIn() {
        System.out.println("Zooming in with Digital Camera.");
    }
    public void zoomOut() {
        System.out.println("Zooming out with Digital Camera.");
    }
    public void enableFlash() {
        System.out.println("Flash enabled on Digital Camera.");
    }
    public void disableFlash() {
        System.out.println("Flash disabled on Digital Camera.");
    }
    public void preview() {
        System.out.println("Previewing image on Digital Camera.");
    }
}







