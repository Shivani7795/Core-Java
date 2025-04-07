public class Airlines {
    int id;
    String airportName;
    String planeName;
    int no_planes;
    String Place;
    int passengers;
    double price;
    int workers;
    String type;
    int airhostess;

    public Airlines() {
    }

    public Airlines(int id) {
        this.id = id;
    }

    public Airlines(int id, String airportName) {
        this(id);
        this.airportName = airportName;
    }

    public Airlines(int id, String airportName, String planeName) {
        this(id, airportName);
        this.planeName = planeName;
    }

    public Airlines(int id, String airportName, String planeName, int no_planes) {
        this(id, airportName, planeName);
        this.no_planes = no_planes;
    }

    public Airlines(int id, String airportName, String planeName, int no_planes, String Place, int passengers, double price, int workers, String type, int airhostess) {
        this(id, airportName, planeName, no_planes);
        this.Place = Place;
        this.passengers = passengers;
        this.price = price;
        this.workers = workers;
        this.type = type;
        this.airhostess = airhostess;
    }

    public void displayDetails() {
        System.out.println("Airlines Details:");
        System.out.println("ID: " + id);
        System.out.println("Airport Name: " + airportName);
        System.out.println("Plane Name: " + planeName);
        System.out.println("Number of Planes: " + no_planes);
        System.out.println("Place: " + Place);
        System.out.println("Passengers: " + passengers);
        System.out.println("Price: " + price);
        System.out.println("Workers: " + workers);
        System.out.println("Type: " + type);
        System.out.println("Number of airhostess: " + airhostess);
        System.out.println("---------------------");
    }
}

