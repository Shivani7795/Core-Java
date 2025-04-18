package methodsequalssetters;

import java.util.Objects;

class Doll {
    private String type;
    private String material;
    private String color;
    private int price;

    public Doll(String type, String material, String color, int price) {
        this.setType(type);
        this.setMaterial(material);
        this.setColor(color);
        this.setPrice(price);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Doll [Type=" + type + ", Material=" + material + ", Color=" + color + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Doll) {
            Doll doll = (Doll) anything;
            if (Objects.equals(this.type, doll.type) &&
                    Objects.equals(this.material, doll.material)) {
                System.out.println("Doll is matching..");
                return true;
            }
        }
        return false;
    }
}
