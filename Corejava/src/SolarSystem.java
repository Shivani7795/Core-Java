public class SolarSystem {
    String name;
    String galaxy;
    String mass;
    int diameter;
    String centralStar;
    double temperature;
    int orbitalPeriod;
    String highestElement;
    boolean water;
    boolean ring;

    public SolarSystem() {
    }

    public SolarSystem(String name) {
        this.name = name;
    }

    public SolarSystem(String name, String galaxy) {
        this(name);
        this.galaxy = galaxy;
    }

    public SolarSystem(String name, String galaxy, String mass) {
        this(name, galaxy);
        this.mass = mass;
    }

    public SolarSystem(String name, String galaxy, String mass, int diameter) {
        this(name, galaxy, mass);
        this.diameter = diameter;
    }

    public SolarSystem(String name, String galaxy, String mass, int diameter, String centralStar, double temperature, int orbitalPeriod, String highestElement, boolean water, boolean ring) {
        this(name, galaxy, mass, diameter);
        this.centralStar = centralStar;
        this.temperature = temperature;
        this.orbitalPeriod = orbitalPeriod;
        this.highestElement = highestElement;
        this.water = water;
        this.ring = ring;
    }

    public void displayDetails() {
        System.out.println("Solar System Details:");
        System.out.println("Name: " + name);
        System.out.println("Galaxy: " + galaxy);
        System.out.println("Mass: " + mass);
        System.out.println("Diameter: " + diameter + " km");
        System.out.println("Central Star: " + centralStar);
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Orbital Period: " + orbitalPeriod + " days");
        System.out.println("Highest Element: " + highestElement);
        System.out.println("Water Present: " + water);
        System.out.println("Has Rings: " + ring);
        System.out.println("---------------------");
    }
}

