package methodsequals;
import java.util.Objects;

public class Bat {
    private String brand;
    private String material;
    private int length;
    private int weight;

    public Bat(String brand, String material, int length, int weight) {
        this.brand = brand;
        this.material = material;
        this.length = length;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bat{" +
                "brand='" + brand +
                ", material='" + material +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bat) {
            Bat bat = (Bat) obj;
            if (Objects.equals(this.brand, bat.brand) &&
                    Objects.equals(this.material, bat.material) &&
                    Objects.equals(this.length, bat.length) &&
                    Objects.equals(this.weight, bat.weight)) {
                System.out.println("Bat is matching...");
                return true;
            }
        }
        return false;
    }
}