package methodsequals;
import java.util.Objects;

public class Cake {
    private String flavor;
    private double weight;
    private String shape;
    private int price;

    public Cake(String flavor, double weight, String shape, int price) {
        this.flavor = flavor;
        this.weight = weight;
        this.shape = shape;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "flavor='" + flavor +
                ", weight=" + weight +
                ", shape='" + shape +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cake) {
            Cake cake = (Cake) obj;
            if (Objects.equals(this.flavor, cake.flavor) &&
                    Objects.equals(this.weight, cake.weight) &&
                    Objects.equals(this.shape, cake.shape) &&
                    Objects.equals(this.price, cake.price)) {
                System.out.println("Cake is matching...");
                return true;
            }
        }
        return false;
    }
}