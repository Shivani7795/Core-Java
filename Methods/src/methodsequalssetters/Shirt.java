package methodsequalssetters;

import java.util.Objects;

class Shirt {
    private String color;
    private String size;
    private String brand;
    private int price;

    public Shirt(String color, String size, String brand, int price) {
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
        return "Shirt [Color=" + color + ", Size=" + size + ", Brand=" + brand + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Shirt) {
            Shirt shirt = (Shirt) anything;
            if (Objects.equals(this.color, shirt.color) &&
                    Objects.equals(this.size, shirt.size)) {
                System.out.println("Shirt is matching..");
                return true;
            }
        }
        return false;
    }
}