package methods;
import java.util.Objects;

public class Butterfly {
    private String species;
    private String color;
    private double wingspan;
    private String habitat;

    public Butterfly(String species, String color, double wingspan, String habitat) {
        this.species = species;
        this.color = color;
        this.wingspan = wingspan;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Butterfly{" +
                "species='" + species +
                ", color='" + color +
                ", wingspan=" + wingspan +
                ", habitat='" + habitat +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Butterfly) {
            Butterfly butterfly = (Butterfly) obj;
            if (Objects.equals(this.species, butterfly.species) &&
                    Objects.equals(this.color, butterfly.color) &&
                    Objects.equals(this.wingspan, butterfly.wingspan) &&
                    Objects.equals(this.habitat, butterfly.habitat)) {
                System.out.println("Butterfly is matching...");
                return true;
            }
        }
        return false;
    }
}