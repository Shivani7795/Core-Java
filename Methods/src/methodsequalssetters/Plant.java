package methodsequalssetters;

import java.util.Objects;

class Plant {
    private String type;
    private String height;
    private String color;
    private int price;

    public Plant(String type, String height, String color, int price) {
        this.setType(type);
        this.setHeight(height);
        this.setColor(color);
        this.setPrice(price);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plant [Type=" + type + ", Height=" + height + ", Color=" + color + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Plant) {
            Plant plant = (Plant) anything;
            if (Objects.equals(this.type, plant.type) &&
                    Objects.equals(this.color, plant.color)) {
                System.out.println("Plant is matching..");
                return true;
            }
        }
        return false;
    }
}