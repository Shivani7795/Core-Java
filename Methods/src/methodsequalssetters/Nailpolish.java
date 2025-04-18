package methodsequalssetters;

import java.util.Objects;

class Nailpolish {
    private String color;
    private String brand;
    private String finish;
    private int price;

    public Nailpolish(String color, String brand, String finish, int price) {
        this.setColor(color);
        this.setBrand(brand);
        this.setFinish(finish);
        this.setPrice(price);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nailpolish [Color=" + color + ", Brand=" + brand + ", Finish=" + finish + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Nailpolish) {
            Nailpolish nailpolish = (Nailpolish) anything;
            if (Objects.equals(this.color, nailpolish.color) &&
                    Objects.equals(this.brand, nailpolish.brand)) {
                System.out.println("Nailpolish is matching..");
                return true;
            }
        }
        return false;
    }
}