package methods;
import java.util.Objects;

public class Chair {
    private String material;
    private String color;
    private int height;
    private int price;

    public Chair(String material, String color, int height, int price) {
        this.material = material;
        this.color = color;
        this.height = height;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "material='" + material +
                ", color='" + color +
                ", height=" + height +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chair) {
            Chair chair = (Chair) obj;
            if (Objects.equals(this.material, chair.material) &&
                    Objects.equals(this.color, chair.color) &&
                    Objects.equals(this.height, chair.height) &&
                    Objects.equals(this.price, chair.price)) {
                System.out.println("Chair is matching...");
                return true;
            }
        }
        return false;
    }
}