package methods;
import java.util.Objects;

public class Bench {
    private String material;
    private int length;
    private int capacity;
    private int price;

    public Bench(String material, int length, int capacity, int price) {
        this.material = material;
        this.length = length;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bench{" +
                "material='" + material +
                ", length=" + length +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bench) {
            Bench bench = (Bench) obj;
            if (Objects.equals(this.material, bench.material) &&
                    Objects.equals(this.length, bench.length) &&
                    Objects.equals(this.capacity, bench.capacity) &&
                    Objects.equals(this.price, bench.price)) {
                System.out.println("Bench is matching...");
                return true;
            }
        }
        return false;
    }
}