package methods;
import java.util.Objects;

public class Bridge {
    private String name;
    private String location;
    private String type;
    private int length;

    public Bridge(String name, String location, String type, int length) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Bridge{" +
                "name='" + name +
                ", location='" + location +
                ", type='" + type +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bridge) {
            Bridge bridge = (Bridge) obj;
            if (Objects.equals(this.name, bridge.name) &&
                    Objects.equals(this.location, bridge.location) &&
                    Objects.equals(this.type, bridge.type) &&
                    Objects.equals(this.length, bridge.length)) {
                System.out.println("Bridge is matching...");
                return true;
            }
        }
        return false;
    }
}