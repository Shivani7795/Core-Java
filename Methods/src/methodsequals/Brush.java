package methodsequals;
import java.util.Objects;

public class Brush {
    private String type;
    private String material;
    private String size;
    private int price;

    public Brush(String type, String material, String size, int price) {
        this.type = type;
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brush{" +
                "type='" + type +
                ", material='" + material +
                ", size='" + size +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Brush) {
            Brush brush = (Brush) obj;
            if (Objects.equals(this.type, brush.type) &&
                    Objects.equals(this.material, brush.material) &&
                    Objects.equals(this.size, brush.size) &&
                    Objects.equals(this.price, brush.price)) {
                System.out.println("Brush is matching...");
                return true;
            }
        }
        return false;
    }
}