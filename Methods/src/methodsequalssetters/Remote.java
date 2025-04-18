package methodsequalssetters;
import java.util.Objects;

class Remote {
    private String brand;
    private String type;
    private int range;
    private String color;

    public Remote(String brand, String type, int range, String color) {
        this.setBrand(brand);
        this.setType(type);
        this.setRange(range);
        this.setColor(color);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Remote [Brand=" + brand + ", Type=" + type + ", Range=" + range + ", Color=" + color + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Remote) {
            Remote remote = (Remote) anything;
            if (Objects.equals(this.brand, remote.brand) &&
                    Objects.equals(this.type, remote.type)) {
                System.out.println("Remote is matching..");
                return true;
            }
        }
        return false;
    }
}






