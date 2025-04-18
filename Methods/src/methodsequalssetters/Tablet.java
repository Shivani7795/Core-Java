package methodsequalssetters;

import java.util.Objects;

class Tablet {
    private String brand;
    private String model;
    private int price;
    private String color;

    public Tablet(String brand, String model, int price, String color) {
        this.setBrand(brand);
        this.setModel(model);
        this.setPrice(price);
        this.setColor(color);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tablet [Brand=" + brand + ", Model=" + model + ", Price=" + price + ", Color=" + color + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Tablet) {
            Tablet tablet = (Tablet) anything;
            if (Objects.equals(this.brand, tablet.brand) &&
                    Objects.equals(this.model, tablet.model)) {
                System.out.println("Tablet is matching..");
                return true;
            }
        }
        return false;
    }
}