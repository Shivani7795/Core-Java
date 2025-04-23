package external;

import internal.Airline;

public class CommercialAirline implements Airline {
    public void bookTicket() {
        System.out.println("Ticket booked through Commercial Airline.");
    }
    public void cancelTicket() {
        System.out.println("Ticket canceled through Commercial Airline.");
    }
    public void assignSeats() {
        System.out.println("Seats assigned by Commercial Airline.");
    }
    public void announceDeparture() {
        System.out.println("Departure announced by Commercial Airline.");
    }
    public void provideInFlightMeals() {
        System.out.println("In-flight meals provided by Commercial Airline.");
    }
    public void manageBaggage() {
        System.out.println("Baggage managed by Commercial Airline.");
    }
    public void trackFlightStatus() {
        System.out.println("Flight status tracked by Commercial Airline.");
    }
    public void upgradeSeat() {
        System.out.println("Seat upgraded by Commercial Airline.");
    }
    public void offerDiscount() {
        System.out.println("Discount offered by Commercial Airline.");
    }
}
