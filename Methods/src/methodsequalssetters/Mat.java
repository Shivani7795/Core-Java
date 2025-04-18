package methodsequalssetters;
import java.util.Objects;

class Mat {
    private String material;
    private String size;
    private String color;
    private int price;

    public Mat(String material, String size, String color, int price) {
        this.setMaterial(material);
        this.setSize(size);
        this.setColor(color);
        this.setPrice(price);
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mat [Material=" + material + ", Size=" + size + ", Color=" + color + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Mat) {
            Mat mat = (Mat) anything;
            if (Objects.equals(this.material, mat.material) &&
                    Objects.equals(this.color, mat.color)) {
                System.out.println("Mat is matching..");
                return true;
            }
        }
        return false;
    }
}
