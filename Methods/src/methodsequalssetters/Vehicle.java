package methodsequalssetters;

import java.util.Objects;

class Vehicle {
    private String type;
    private String brand;
    private int price;
    private String color;

    public Vehicle(String type, String brand, int price, String color) {
        this.setType(type);
        this.setBrand(brand);
        this.setPrice(price);
        this.setColor(color);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle [Type=" + type + ", Brand=" + brand + ", Price=" + price + ", Color=" + color + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) anything;
            if (Objects.equals(this.type, vehicle.type) &&
                    Objects.equals(this.brand, vehicle.brand)) {
                System.out.println("Vehicle is matching..");
                return true;
            }
        }
        return false;
    }
}