package methodsequals;
import java.util.Objects;

public class Mobile {
    private  String brand;
    private  int modelNumber;
    private  String color;
    private  int price;

    public Mobile(String brand, int modelNumber, String color, int price) {
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand +
                ", modelNumber=" + modelNumber +
                ", color='" + color +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mobile) {
            Mobile mobile = (Mobile) obj;
            if (Objects.equals(this.brand, mobile.brand) &&
                    Objects.equals(this.modelNumber, mobile.modelNumber) &&
                    Objects.equals(this.color, mobile.color) &&
                    Objects.equals(this.price, mobile.price)) {
                System.out.println("Mobile is matching...");
                return true;
            }
        }
        return false;
    }
}