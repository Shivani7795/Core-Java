package methodsequals;
import java.util.Objects;

public class Curtain {
    private String color;
    private int cost;
    private String brand;
    private int length;

    public Curtain(String color, int cost, String brand, int length) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Curtain{" +
                "color=" + color +
                ", cost=" + cost +
                ", brand='" + brand +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Curtain) {
            Curtain curtain = (Curtain) obj;
            if (Objects.equals(this.color, curtain.color) &&
                    Objects.equals(this.cost, curtain.cost) &&
                    Objects.equals(this.brand, curtain.brand) &&
                    Objects.equals(this.length, curtain.length)) {
                System.out.println("Curtain is matching...");
                return true;
            }
        }
        return false;
    }
}

