package methodsequals;
import java.util.Objects;

public class Bottle {
    private  String color;
    private  int cost;
    private  String brand;
    private  int capacity;

    public Bottle(String color, int cost, String brand, int capacity) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Bottle{" +
                "color=" + color +
                ", cost=" + cost +
                ", brand='" + brand +
                ", capacity=" + capacity +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bottle) {
            Bottle bottle = (Bottle) obj;
            if (Objects.equals(this.color, bottle.color) &&
                    Objects.equals(this.cost, bottle.cost) &&
                    Objects.equals(this.brand, bottle.brand) &&
                    Objects.equals(this.capacity, bottle.capacity)) {
                System.out.println("Bottle is matching...");
                return true;
            }
        }
        return false;
    }
}