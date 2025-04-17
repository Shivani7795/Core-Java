package methodsequals;
import java.util.Objects;

public class Carpet {
    private String material;
    private String size;
    private String color;
    private int price;

    public Carpet(String material, String size, String color, int price) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "material='" + material +
                ", size='" + size +
                ", color='" + color +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Carpet) {
            Carpet carpet = (Carpet) obj;
            if (Objects.equals(this.material, carpet.material) &&
                    Objects.equals(this.size, carpet.size) &&
                    Objects.equals(this.color, carpet.color) &&
                    Objects.equals(this.price, carpet.price)) {
                System.out.println("Carpet is matching...");
                return true;
            }
        }
        return false;
    }
}