package methods;
import java.util.Objects;

public class Beach {
    private String name;
    private String location;
    private double area;
    private boolean hasLifeguards;

    public Beach(String name, String location, double area, boolean hasLifeguards) {
        this.name = name;
        this.location = location;
        this.area = area;
        this.hasLifeguards = hasLifeguards;
    }

    @Override
    public String toString() {
        return "Beach{" +
                "name='" + name +
                ", location='" + location +
                ", area=" + area +
                ", hasLifeguards=" + hasLifeguards +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Beach) {
            Beach beach = (Beach) obj;
            if (Objects.equals(this.name, beach.name) &&
                    Objects.equals(this.location, beach.location) &&
                    Objects.equals(this.area, beach.area) &&
                    Objects.equals(this.hasLifeguards, beach.hasLifeguards)) {
                System.out.println("Beach is matching...");
                return true;
            }
        }
        return false;
    }
}