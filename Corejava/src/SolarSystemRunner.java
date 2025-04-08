public class SolarSystemRunner {
    public static void main(String[] args) {
        SolarSystem solarSystem1 = new SolarSystem("Earth");
        solarSystem1.displayDetails();

        SolarSystem solarSystem2 = new SolarSystem("Mars", "Milky Way");
        solarSystem2.displayDetails();

        SolarSystem solarSystem3 = new SolarSystem("Saturn", "Milky Way", "5.68 x 10^26 kg");
        solarSystem3.displayDetails();

        SolarSystem solarSystem4 = new SolarSystem("Venus", "Milky Way", "4.87 x 10^24 kg", 12104);
        solarSystem4.displayDetails();

        SolarSystem solarSystem5 = new SolarSystem("Neptune", "Milky Way", "1.02 x 10^26 kg", 49528, "Sun", -200.0, 60190, "Methane", false, true);
        solarSystem5.displayDetails();
    }
}