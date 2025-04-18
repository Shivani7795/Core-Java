package methodsequalssetters;

import java.util.Objects;

class Pillow {
    private String material;
    private String size;
    private String color;
    private int price;

    public Pillow(String material, String size, String color, int price) {
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
        return "Pillow [Material=" + material + ", Size=" + size + ", Color=" + color + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Pillow) {
            Pillow pillow = (Pillow) anything;
            if (Objects.equals(this.material, pillow.material) &&
                    Objects.equals(this.size, pillow.size)) {
                System.out.println("Pillow is matching..");
                return true;
            }
        }
        return false;
    }
}