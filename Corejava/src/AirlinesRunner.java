public class AirlinesRunner {
    public static void main(String[] args) {
        Airlines airlines1 = new Airlines(1);
        airlines1.displayDetails();

        Airlines airlines2 = new Airlines(2, "Indira Gandhi International Airport");
        airlines2.displayDetails();

        Airlines airlines3 = new Airlines(3, "Chhatrapati Shivaji Maharaj Airport", "ATR 72");
        airlines3.displayDetails();

        Airlines airlines4 = new Airlines(4, "Netaji Subhash Chandra Bose Airport", "Embraer E190", 50);
        airlines4.displayDetails();

        Airlines airlines5 = new Airlines(5, "Rajiv Gandhi International Airport", "Bombardier Q400", 70, "Hyderabad", 140, 23000.65, 45, "International", 18);
        airlines5.displayDetails();
    }
}