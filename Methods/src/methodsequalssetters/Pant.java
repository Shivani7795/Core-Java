package methodsequalssetters;

import java.util.Objects;

class Pant {
    private String color;
    private String size;
    private String brand;
    private int price;

    public Pant(String color, String size, String brand, int price) {
        this.setColor(color);
        this.setSize(size);
        this.setBrand(brand);
        this.setPrice(price);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pant [Color=" + color + ", Size=" + size + ", Brand=" + brand + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Pant) {
            Pant pant = (Pant) anything;
            if (Objects.equals(this.color, pant.color) &&
                    Objects.equals(this.size, pant.size)) {
                System.out.println("Pant is matching..");
                return true;
            }
        }
        return false;
    }
}
