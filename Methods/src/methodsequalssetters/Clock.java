package methodsequalssetters;

import java.util.Objects;

class Clock {
    private String brand;
    private String type;
    private int price;
    private String color;

    public Clock(String brand, String type, int price, String color) {
        this.setBrand(brand);
        this.setType(type);
        this.setPrice(price);
        this.setColor(color);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clock [Brand=" + brand + ", Type=" + type + ", Price=" + price + ", Color=" + color + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Clock) {
            Clock clock = (Clock) anything;
            if (Objects.equals(this.brand, clock.brand) &&
                    Objects.equals(this.type, clock.type)) {
                System.out.println("Clock is matching..");
                return true;
            }
        }
        return false;
    }
}

