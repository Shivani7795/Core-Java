package methodsequals;
import java.util.Objects;

public class Charger {
    private String brand;
    private int powerOutput;
    private String type;
    private int price;

    public Charger(String brand, int powerOutput, String type, int price) {
        this.brand = brand;
        this.powerOutput = powerOutput;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Charger{" +
                "brand='" + brand +
                ", powerOutput=" + powerOutput +
                ", type='" + type +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Charger) {
            Charger charger = (Charger) obj;
            if (Objects.equals(this.brand, charger.brand) &&
                    Objects.equals(this.powerOutput, charger.powerOutput) &&
                    Objects.equals(this.type, charger.type) &&
                    Objects.equals(this.price, charger.price)) {
                System.out.println("Charger is matching...");
                return true;
            }
        }
        return false;
    }
}