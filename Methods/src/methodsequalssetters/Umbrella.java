package methodsequalssetters;
import java.util.Objects;

class Umbrella {
    private String color;
    private String size;
    private String material;
    private int price;

    public Umbrella(String color, String size, String material, int price) {
        this.setColor(color);
        this.setSize(size);
        this.setMaterial(material);
        this.setPrice(price);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Umbrella [Color=" + color + ", Size=" + size + ", Material=" + material + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Umbrella) {
            Umbrella umbrella = (Umbrella) anything;
            if (Objects.equals(this.color, umbrella.color) &&
                    Objects.equals(this.size, umbrella.size)) {
                System.out.println("Umbrella is matching..");
                return true;
            }
        }
        return false;
    }
}