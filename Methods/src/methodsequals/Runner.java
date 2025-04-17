package methodsequals;
public class Runner {
    public static void main(String[] args) {

        Bottle bottle1 = new Bottle("Red", 20, "BrandA", 1000);
        Bottle bottle2 = new Bottle("Black", 15, "BrandB", 500);
        Bottle bottle3 = new Bottle("Black", 15, "BrandB", 500);

        boolean match = bottle1.equals(bottle2);
        boolean match1 = bottle2.equals(bottle3);
        boolean notMatch = bottle3.equals(bottle2);

        System.out.println("Bottle match: " + match);
        System.out.println("Bottle match: " + match1);
        System.out.println("Bottle not match: " + notMatch);
        System.out.println("");

        Mobile mobile1 = new Mobile("Samsung", 12345, "Black", 25000);
        Mobile mobile2 = new Mobile("Apple", 67890, "White", 80000);
        Mobile mobile3 = new Mobile("Apple", 67890, "White", 80000);

        boolean matchMobile = mobile1.equals(mobile2);
        boolean notMatchMobile = mobile3.equals(mobile2);

        System.out.println("Mobile match: " + matchMobile);
        System.out.println("Mobile not match: " + notMatchMobile);
        System.out.println("");


        Curtain curtain1 = new Curtain("Blue", 200, "BrandX", 120);
        Curtain curtain2 = new Curtain("White", 150, "BrandY", 90);
        Curtain curtain3 = new Curtain("White", 150, "BrandY", 90);

        boolean matchCurtain = curtain1.equals(curtain2);
        boolean match1Curtain = curtain2.equals(curtain3);
        boolean notMatchCurtain = curtain3.equals(curtain2);

        System.out.println("Curtain match: " + matchCurtain);
        System.out.println("Curtain match: " + match1Curtain);
        System.out.println("Curtain not match: " + notMatchCurtain);
        System.out.println("");


        Album album1 = new Album("Thriller", "Michael Jackson", "Pop", 1500);
        Album album2 = new Album("Back in Black", "AC/DC", "Rock", 2000);
        Album album3 = new Album("Back in Black", "AC/DC", "Rock", 2000);

        boolean matchAlbum = album1.equals(album2);
        boolean notMatchAlbum = album3.equals(album2);

        System.out.println("Album match: " + matchAlbum);
        System.out.println("Album not match: " + notMatchAlbum);
        System.out.println("");

        Animal animal1 = new Animal("Lion", "Panthera leo", 5, "Savanna");
        Animal animal2 = new Animal("Tiger", "Panthera tigris", 3, "Forest");
        Animal animal3 = new Animal("Tiger", "Panthera tigris", 3, "Forest");

        boolean matchAnimal = animal1.equals(animal2);
        boolean notMatchAnimal = animal3.equals(animal2);

        System.out.println("Animal match: " + matchAnimal);
        System.out.println("Animal not match: " + notMatchAnimal);
        System.out.println("");

        Army army1 = new Army("Infantry", 1000, "USA", "Tactical Maneuvers");
        Army army2 = new Army("Armored", 500, "Russia", "Tank Operations");
        Army army3 = new Army("Armored", 500, "Russia", "Tank Operations");

        boolean matchArmy = army1.equals(army2);
        boolean notMatchArmy = army3.equals(army2);

        System.out.println("Army match: " + matchArmy);
        System.out.println("Army not match: " + notMatchArmy);
        System.out.println("");

        Barbie barbie1 = new Barbie("Dreamhouse", "Pink Gown", "Blonde", 1500);
        Barbie barbie2 = new Barbie("Explorer", "Adventure Outfit", "Brunette", 2000);
        Barbie barbie3 = new Barbie("Explorer", "Adventure Outfit", "Brunette", 2000);
        boolean matchBarbie = barbie1.equals(barbie2);
        boolean notMatchBarbie = barbie3.equals(barbie2);
        System.out.println("Barbie match: " + matchBarbie);
        System.out.println("Barbie not match: " + notMatchBarbie);
        System.out.println("");

        Chair chair1 = new Chair("Wood", "Brown", 4, 1200);
        Chair chair2 = new Chair("Metal", "Black", 5, 1500);
        Chair chair3 = new Chair("Metal", "Black", 5, 1500);
        boolean matchChair = chair1.equals(chair2);
        boolean notMatchChair = chair3.equals(chair2);
        System.out.println("Chair match: " + matchChair);
        System.out.println("Chair not match: " + notMatchChair);
        System.out.println("");

        Bridge bridge1 = new Bridge("Golden Gate", "San Francisco", "Suspension", 2737);
        Bridge bridge2 = new Bridge("Brooklyn Bridge", "New York", "Cable-Stayed", 1825);
        Bridge bridge3 = new Bridge("Brooklyn Bridge", "New York", "Cable-Stayed", 1825);
        boolean matchBridge = bridge1.equals(bridge2);
        boolean notMatchBridge = bridge3.equals(bridge2);
        System.out.println("Bridge match: " + matchBridge);
        System.out.println("Bridge not match: " + notMatchBridge);
        System.out.println("");

        Brush brush1 = new Brush("Paint Brush", "Wood", "Medium", 200);
        Brush brush2 = new Brush("Toothbrush", "Plastic", "Small", 50);
        Brush brush3 = new Brush("Toothbrush", "Plastic", "Small", 50);
        boolean matchBrush = brush1.equals(brush2);
        boolean notMatchBrush = brush3.equals(brush2);
        System.out.println("Brush match: " + matchBrush);
        System.out.println("Brush not match: " + notMatchBrush);
        System.out.println("");

        Butterfly butterfly1 = new Butterfly("Monarch", "Orange", 4.5, "Garden");
        Butterfly butterfly2 = new Butterfly("Swallowtail", "Yellow", 5.0, "Forest");
        Butterfly butterfly3 = new Butterfly("Swallowtail", "Yellow", 5.0, "Forest");
        boolean matchButterfly = butterfly1.equals(butterfly2);
        boolean notMatchButterfly = butterfly3.equals(butterfly2);
        System.out.println("Butterfly match: " + matchButterfly);
        System.out.println("Butterfly not match: " + notMatchButterfly);
        System.out.println("");

        Cake cake1 = new Cake("Chocolate", 1.5, "Round", 500);
        Cake cake2 = new Cake("Vanilla", 2.0, "Square", 600);
        Cake cake3 = new Cake("Vanilla", 2.0, "Square", 600);
        boolean matchCake = cake1.equals(cake2);
        boolean notMatchCake = cake3.equals(cake2);
        System.out.println("Cake match: " + matchCake);
        System.out.println("Cake not match: " + notMatchCake);
        System.out.println("");

        Car car1 = new Car("Toyota", "Camry", "White", 2500000);
        Car car2 = new Car("Honda", "Civic", "Red", 2200000);
        Car car3 = new Car("Honda", "Civic", "Red", 2200000);
        boolean matchCar = car1.equals(car2);
        boolean notMatchCar = car3.equals(car2);
        System.out.println("Car match: " + matchCar);
        System.out.println("Car not match: " + notMatchCar);
        System.out.println("");

        Carpet carpet1 = new Carpet("Wool", "Large", "Red", 3500);
        Carpet carpet2 = new Carpet("Cotton", "Medium", "Blue", 2500);
        Carpet carpet3 = new Carpet("Cotton", "Medium", "Blue", 2500);
        boolean matchCarpet = carpet1.equals(carpet2);
        boolean notMatchCarpet = carpet3.equals(carpet2);
        System.out.println("Carpet match: " + matchCarpet);
        System.out.println("Carpet not match: " + notMatchCarpet);
        System.out.println("");

        Table table1 = new Table("Wood", 4, "Rectangular", 4000);
        Table table2 = new Table("Metal", 5, "Round", 5000);
        Table table3 = new Table("Metal", 5, "Round", 5000);
        boolean matchTable = table1.equals(table2);
        boolean notMatchTable = table3.equals(table2);
        System.out.println("Table match: " + matchTable);
        System.out.println("Table not match: " + notMatchTable);
        System.out.println("");

        City city1 = new City("Tokyo", "Japan", 14000000, 2194);
        City city2 = new City("Paris", "France", 2200000, 105);
        City city3 = new City("Paris", "France", 2200000, 105);
        boolean matchCity = city1.equals(city2);
        boolean notMatchCity = city3.equals(city2);
        System.out.println("City match: " + matchCity);
        System.out.println("City not match: " + notMatchCity);
        System.out.println("");

        Charger charger1 = new Charger("Samsung", 20, "USB-C", 1500);
        Charger charger2 = new Charger("Apple", 18, "Lightning", 2500);
        Charger charger3 = new Charger("Apple", 18, "Lightning", 2500);
        boolean matchCharger = charger1.equals(charger2);
        boolean notMatchCharger = charger3.equals(charger2);
        System.out.println("Charger match: " + matchCharger);
        System.out.println("Charger not match: " + notMatchCharger);
        System.out.println("");

        Bat bat1 = new Bat("SS", "Willow", 33, 1200);
        Bat bat2 = new Bat("MRF", "Kashmir Willow", 34, 1500);
        Bat bat3 = new Bat("MRF", "Kashmir Willow", 34, 1500);
        boolean matchBat = bat1.equals(bat2);
        boolean notMatchBat = bat3.equals(bat2);
        System.out.println("Bat match: " + matchBat);
        System.out.println("Bat not match: " + notMatchBat);
        System.out.println("");

        Beach beach1 = new Beach("Bondi", "Australia", 1.5, true);
        Beach beach2 = new Beach("Copacabana", "Brazil", 2.5, false);
        Beach beach3 = new Beach("Copacabana", "Brazil", 2.5, false);
        boolean matchBeach = beach1.equals(beach2);
        boolean notMatchBeach = beach3.equals(beach2);
        System.out.println("Beach match: " + matchBeach);
        System.out.println("Beach not match: " + notMatchBeach);
        System.out.println("");

        Bed bed1 = new Bed("King", "Wood", "Large", 25000);
        Bed bed2 = new Bed("Queen", "Metal", "Medium", 20000);
        Bed bed3 = new Bed("Queen", "Metal", "Medium", 20000);
        boolean matchBed = bed1.equals(bed2);
        boolean notMatchBed = bed3.equals(bed2);
        System.out.println("Bed match: " + matchBed);
        System.out.println("Bed not match: " + notMatchBed);
        System.out.println("");

        Belt belt1 = new Belt("Leather", "Medium", "Black", 800);
        Belt belt2 = new Belt("Fabric", "Large", "Brown", 500);
        Belt belt3 = new Belt("Fabric", "Large", "Brown", 500);
        boolean matchBelt = belt1.equals(belt2);
        boolean notMatchBelt = belt3.equals(belt2);
        System.out.println("Belt match: " + matchBelt);
        System.out.println("Belt not match: " + notMatchBelt);
        System.out.println("");

        Bench bench1 = new Bench("Wood", 200, 4, 1500);
        Bench bench2 = new Bench("Metal", 180, 3, 1200);
        Bench bench3 = new Bench("Metal", 180, 3, 1200);
        boolean matchBench = bench1.equals(bench2);
        boolean notMatchBench = bench3.equals(bench2);
        System.out.println("Bench match: " + matchBench);
        System.out.println("Bench not match: " + notMatchBench);
        System.out.println("");

        Bike bike1 = new Bike("Yamaha", "R15", "Blue", 150000);
        Bike bike2 = new Bike("Honda", "CBR", "Red", 140000);
        Bike bike3 = new Bike("Honda", "CBR", "Red", 140000);
        boolean matchBike = bike1.equals(bike2);
        boolean notMatchBike = bike3.equals(bike2);
        System.out.println("Bike match: " + matchBike);
        System.out.println("Bike not match: " + notMatchBike);
        System.out.println("");

        Book book1 = new Book("1984", "George Orwell", 328, 500);
        Book book2 = new Book("Animal Farm", "George Orwell", 112, 300);
        Book book3 = new Book("Animal Farm", "George Orwell", 112, 300);
        boolean matchBook = book1.equals(book2);
        boolean notMatchBook = book3.equals(book2);
        System.out.println("Book match: " + matchBook);
        System.out.println("Book not match: " + notMatchBook);
        System.out.println("");

        Box box1 = new Box("Cardboard", "Large", "Brown", 30);
        Box box2 = new Box("Plastic", "Medium", "White", 50);
        Box box3 = new Box("Plastic", "Medium", "White", 50);
        boolean matchBox = box1.equals(box2);
        boolean notMatchBox = box3.equals(box2);
        System.out.println("Box match: " + matchBox);
        System.out.println("Box not match: " + notMatchBox);
        System.out.println("");



    }
}