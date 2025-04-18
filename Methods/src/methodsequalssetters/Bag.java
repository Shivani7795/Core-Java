package methodsequalssetters;

import java.util.Objects;

class Bag {
    private String brand;
    private String color;
    private String material;
    private int price;

    public Bag(String brand, String color, String material, int price) {
        this.setBrand(brand);
        this.setColor(color);
        this.setMaterial(material);
        this.setPrice(price);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bag [Brand=" + brand + ", Color=" + color + ", Material=" + material + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Bag) {
            Bag bag = (Bag) anything;
            if (Objects.equals(this.brand, bag.brand) &&
                    Objects.equals(this.color, bag.color)) {
                System.out.println("Bag is matching..");
                return true;
            }
        }
        return false;
    }
}
