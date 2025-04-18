package methodsequalssetters;

import java.util.Objects;

class Cup {
    private String material;
    private String size;
    private int price;
    private String color;

    public Cup(String material, String size, int price, String color) {
        this.setMaterial(material);
        this.setSize(size);
        this.setPrice(price);
        this.setColor(color);
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cup [Material=" + material + ", Size=" + size + ", Price=" + price + ", Color=" + color + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Cup) {
            Cup cup = (Cup) anything;
            if (Objects.equals(this.material, cup.material) &&
                    Objects.equals(this.size, cup.size)) {
                System.out.println("Cup is matching..");
                return true;
            }
        }
        return false;
    }
}