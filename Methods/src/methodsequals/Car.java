package methodsequals;
import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int price;

    public Car(String brand, String model, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand +
                ", model='" + model +
                ", color='" + color +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Car) {
            Car car = (Car) obj;
            if (Objects.equals(this.brand, car.brand) &&
                    Objects.equals(this.model, car.model) &&
                    Objects.equals(this.color, car.color) &&
                    Objects.equals(this.price, car.price)) {
                System.out.println("Car is matching...");
                return true;
            }
        }
        return false;
    }
}