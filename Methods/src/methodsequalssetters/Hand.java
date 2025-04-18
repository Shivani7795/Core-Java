package methodsequalssetters;

import java.util.Objects;

class Hand {
    private String size;
    private String color;
    private String side;
    private int strength;

    public Hand(String size, String color, String side, int strength) {
        this.setSize(size);
        this.setColor(color);
        this.setSide(side);
        this.setStrength(strength);
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Hand [Size=" + size + ", Color=" + color + ", Side=" + side + ", Strength=" + strength + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Hand) {
            Hand hand = (Hand) anything;
            if (Objects.equals(this.size, hand.size) &&
                    Objects.equals(this.side, hand.side)) {
                System.out.println("Hand is matching..");
                return true;
            }
        }
        return false;
    }
}
