package methodsequalssetters;

import java.util.Objects;

class Gold {
    private String purity;
    private String weight;
    private String color;
    private int price;

    public Gold(String purity, String weight, String color, int price) {
        this.setPurity(purity);
        this.setWeight(weight);
        this.setColor(color);
        this.setPrice(price);
    }

    public void setPurity(String purity) {
        this.purity = purity;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gold [Purity=" + purity + ", Weight=" + weight + ", Color=" + color + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Gold) {
            Gold gold = (Gold) anything;
            if (Objects.equals(this.purity, gold.purity) &&
                    Objects.equals(this.weight, gold.weight)) {
                System.out.println("Gold is matching..");
                return true;
            }
        }
        return false;
    }
}