package methodsequalssetters;

import java.util.Objects;

class Cloud {
    private String type;
    private String color;
    private String shape;
    private double altitude;

    public Cloud(String type, String color, String shape, double altitude) {
        this.setType(type);
        this.setColor(color);
        this.setShape(shape);
        this.setAltitude(altitude);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Cloud [Type=" + type + ", Color=" + color + ", Shape=" + shape + ", Altitude=" + altitude + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Cloud) {
            Cloud cloud = (Cloud) anything;
            if (Objects.equals(this.type, cloud.type) &&
                    Objects.equals(this.color, cloud.color)) {
                System.out.println("Cloud is matching..");
                return true;
            }
        }
        return false;
    }
}
