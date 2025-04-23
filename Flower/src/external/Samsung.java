package external;

import internal.Smartphone;

public class Samsung implements Smartphone {
    public void makeCall() {
        System.out.println("Call made using Samsung smartphone.");
    }

    public void sendText() {
        System.out.println("Text sent using Samsung smartphone.");
    }

    public void browseInternet() {
        System.out.println("Browsing internet on Samsung smartphone.");
    }
}
