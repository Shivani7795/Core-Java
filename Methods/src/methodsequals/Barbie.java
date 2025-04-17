package methodsequals;
import java.util.Objects;

public class Barbie {
    private String name;
    private String outfit;
    private String hairColor;
    private int price;

    public Barbie(String name, String outfit, String hairColor, int price) {
        this.name = name;
        this.outfit = outfit;
        this.hairColor = hairColor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Barbie{" +
                "name='" + name +
                ", outfit='" + outfit +
                ", hairColor='" + hairColor +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Barbie) {
            Barbie barbie = (Barbie) obj;
            if (Objects.equals(this.name, barbie.name) &&
                    Objects.equals(this.outfit, barbie.outfit) &&
                    Objects.equals(this.hairColor, barbie.hairColor) &&
                    Objects.equals(this.price, barbie.price)) {
                System.out.println("Barbie is matching...");
                return true;
            }
        }
        return false;
    }
}