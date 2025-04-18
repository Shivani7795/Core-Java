package methodsequalssetters;

import java.util.Objects;

class Fan {
    private String brand;
    private String type;
    private int speed;
    private String color;

    public Fan(String brand, String type, int speed, String color) {
        this.setBrand(brand);
        this.setType(type);
        this.setSpeed(speed);
        this.setColor(color);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan [Brand=" + brand + ", Type=" + type + ", Speed=" + speed + ", Color=" + color + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Fan) {
            Fan fan = (Fan) anything;
            if (Objects.equals(this.brand, fan.brand) &&
                    Objects.equals(this.type, fan.type)) {
                System.out.println("Fan is matching..");
                return true;
            }
        }
        return false;
    }
}
