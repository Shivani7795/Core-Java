public class AirlinesRunner {
    public static void main(String[] args) {
        Airlines airlines1 = new Airlines(1, "Kempegowda International Airport", "Boeing 747", 100, "Bangalore", 200, 35000.50, 50, "International", 20);
        airlines1.displayDetails();

        Airlines airlines2 = new Airlines(2, "Indira Gandhi International Airport", "Airbus A320", 80, "Delhi", 150, 25000.75, 40, "Domestic", 15);
        airlines2.displayDetails();

        Airlines airlines3 = new Airlines(3, "Chhatrapati Shivaji Maharaj Airport", "ATR 72", 60, "Mumbai", 120, 20000.30, 35, "Domestic", 12);
        airlines3.displayDetails();

        Airlines airlines4 = new Airlines(4, "Netaji Subhash Chandra Bose Airport", "Embraer E190", 50, "Kolkata", 100, 18000.20, 30, "Domestic", 10);
        airlines4.displayDetails();

        Airlines airlines5 = new Airlines(5, "Rajiv Gandhi International Airport", "Bombardier Q400", 70, "Hyderabad", 140, 23000.65, 45, "International", 18);
        airlines5.displayDetails();
    }
}