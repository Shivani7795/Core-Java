package methodsequals;
import java.util.Objects;

public class Belt {
    private String material;
    private String size;
    private String color;
    private int price;

    public Belt(String material, String size, String color, int price) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Belt{" +
                "material='" + material +
                ", size='" + size +
                ", color='" + color +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Belt) {
            Belt belt = (Belt) obj;
            if (Objects.equals(this.material, belt.material) &&
                    Objects.equals(this.size, belt.size) &&
                    Objects.equals(this.color, belt.color) &&
                    Objects.equals(this.price, belt.price)) {
                System.out.println("Belt is matching...");
                return true;
            }
        }
        return false;
    }
}