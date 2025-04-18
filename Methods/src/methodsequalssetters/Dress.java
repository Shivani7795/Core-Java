package methodsequalssetters;

import java.util.Objects;

class Dress {
    private String color;
    private String size;
    private String brand;
    private int price;

    public Dress(String color, String size, String brand, int price) {
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
        return "Dress [Color=" + color + ", Size=" + size + ", Brand=" + brand + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Dress) {
            Dress dress = (Dress) anything;
            if (Objects.equals(this.color, dress.color) &&
                    Objects.equals(this.size, dress.size)) {
                System.out.println("Dress is matching..");
                return true;
            }
        }
        return false;
    }
}

