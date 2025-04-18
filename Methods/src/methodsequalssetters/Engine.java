package methodsequalssetters;

import java.util.Objects;

class Engine {
    private String type;
    private int horsepower;
    private String brand;
    private int price;

    public Engine(String type, int horsepower, String brand, int price) {
        this.setType(type);
        this.setHorsepower(horsepower);
        this.setBrand(brand);
        this.setPrice(price);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Engine [Type=" + type + ", Horsepower=" + horsepower + ", Brand=" + brand + ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Engine) {
            Engine engine = (Engine) anything;
            if (Objects.equals(this.type, engine.type) &&
                    Objects.equals(this.brand, engine.brand)) {
                System.out.println("Engine is matching..");
                return true;
            }
        }
        return false;
    }
}
