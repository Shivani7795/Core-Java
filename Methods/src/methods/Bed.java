package methods;
import java.util.Objects;

public class Bed {
    private String type;
    private String material;
    private String size;
    private int price;

    public Bed(String type, String material, String size, int price) {
        this.type = type;
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "type='" + type +
                ", material='" + material +
                ", size='" + size +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bed) {
            Bed bed = (Bed) obj;
            if (Objects.equals(this.type, bed.type) &&
                    Objects.equals(this.material, bed.material) &&
                    Objects.equals(this.size, bed.size) &&
                    Objects.equals(this.price, bed.price)) {
                System.out.println("Bed is matching...");
                return true;
            }
        }
        return false;
    }
}