package methodsequals;
import java.util.Objects;

public class Box {
    private String material;
    private String size;
    private String color;
    private int capacity;

    public Box(String material, String size, String color, int capacity) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Box{" +
                "material='" + material +
                ", size='" + size +
                ", color='" + color +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Box) {
            Box box = (Box) obj;
            if (Objects.equals(this.material, box.material) &&
                    Objects.equals(this.size, box.size) &&
                    Objects.equals(this.color, box.color) &&
                    Objects.equals(this.capacity, box.capacity)) {
                System.out.println("Box is matching...");
                return true;
            }
        }
        return false;
    }
}