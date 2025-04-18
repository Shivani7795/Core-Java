package methodsequalssetters;

import java.util.Objects;

class Apartment {
    private String location;
    private int price;
    private int size;
    private String owner;

    public Apartment(String location, int price, int size, String owner) {
        this.setLocation(location);
        this.setPrice(price);
        this.setSize(size);
        this.setOwner(owner);
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Apartment [Location=" + location + ", Price=" + price + ", Size=" + size + ", Owner=" + owner + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Apartment) {
            Apartment apartment = (Apartment) anything;
            if (Objects.equals(this.location, apartment.location) &&
                    Objects.equals(this.price, apartment.price)) {
                System.out.println("Apartment is matching..");
                return true;
            }
        }
        return false;
    }
}
