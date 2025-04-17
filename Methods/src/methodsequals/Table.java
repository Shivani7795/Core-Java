package methodsequals;
import java.util.Objects;

public class Table {
    private String material;
    private int height;
    private String shape;
    private int price;

    public Table(String material, int height, String shape, int price) {
        this.material = material;
        this.height = height;
        this.shape = shape;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Table{" +
                "material='" + material +
                ", height=" + height +
                ", shape='" + shape +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Table) {
            Table table = (Table) obj;
            if (Objects.equals(this.material, table.material) &&
                    Objects.equals(this.height, table.height) &&
                    Objects.equals(this.shape, table.shape) &&
                    Objects.equals(this.price, table.price)) {
                System.out.println("Table is matching...");
                return true;
            }
        }
        return false;
    }
}