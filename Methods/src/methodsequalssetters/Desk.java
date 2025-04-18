package methodsequalssetters;
import java.util.Objects;

class Desk {
    private String material;
    private String color;
    private int size;
    private int price;

    public Desk(String material, String color, int size, int price) {
        this.setMaterial(material);
        this.setColor(color);
        this.setSize(size);
        this.setPrice(price);
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Desk [Material=" + material + ", Color=" + color + ", Size=" + size + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Desk) {
            Desk desk = (Desk) anything;
            if (Objects.equals(this.material, desk.material) &&
                    Objects.equals(this.color, desk.color)) {
                System.out.println("Desk is matching..");
                return true;
            }
        }
        return false;
    }
}


