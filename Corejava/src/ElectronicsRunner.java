public class ElectronicsRunner {
    public static void main(String[] args) {
        Electronics electronics1 = new Electronics(1);
        electronics1.displayDetails();

        Electronics electronics2 = new Electronics(2, "Laptop");
        electronics2.displayDetails();

        Electronics electronics3 = new Electronics(3, "Smartphone", "Communication");
        electronics3.displayDetails();

        Electronics electronics4 = new Electronics(4, "Microwave", "Cooking", true);
        electronics4.displayDetails();

        Electronics electronics5 = new Electronics(5, "Camera", "Photography", true, 2.5, true, "Plastic", 24, 15000, true);
        electronics5.displayDetails();
    }
}