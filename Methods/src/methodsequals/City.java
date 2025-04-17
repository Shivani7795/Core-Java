package methodsequals;
import java.util.Objects;

public class City {
    private String name;
    private String country;
    private int population;
    private double area;

    public City(String name, String country, int population, double area) {
        this.name = name;
        this.country = country;
        this.population = population;
        this.area = area;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name +
                ", country='" + country +
                ", population=" + population +
                ", area=" + area +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof City) {
            City city = (City) obj;
            if (Objects.equals(this.name, city.name) &&
                    Objects.equals(this.country, city.country) &&
                    Objects.equals(this.population, city.population) &&
                    Objects.equals(this.area, city.area)) {
                System.out.println("City is matching...");
                return true;
            }
        }
        return false;
    }
}