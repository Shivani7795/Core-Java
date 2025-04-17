package methods;
import java.util.Objects;

public class Bike {
    private String brand;
    private String model;
    private String color;
    private int price;

    public Bike(String brand, String model, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand +
                ", model='" + model +
                ", color='" + color +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bike) {
            Bike bike = (Bike) obj;
            if (Objects.equals(this.brand, bike.brand) &&
                    Objects.equals(this.model, bike.model) &&
                    Objects.equals(this.color, bike.color) &&
                    Objects.equals(this.price, bike.price)) {
                System.out.println("Bike is matching...");
                return true;
            }
        }
        return false;
    }
}