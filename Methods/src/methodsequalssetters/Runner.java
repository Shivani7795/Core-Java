package methodsequalssetters;

public class Runner {
    public static void main(String[] args) {
        Remote remote1 = new Remote("Sony", "Universal", 30, "Black");
        Remote remote2 = new Remote("Samsung", "TV Remote", 25, "White");
        Remote remote3 = new Remote("Sony", "Universal", 30, "Black");

        boolean matchRemote = remote1.equals(remote2);
        boolean notMatchRemote = remote3.equals(remote2);

        System.out.println("Remote match: " + matchRemote);
        System.out.println("Remote not match: " + notMatchRemote);
        System.out.println("");

        Nailpolish nailpolish1 = new Nailpolish("Red", "Lakme", "Glossy", 150);
        Nailpolish nailpolish2 = new Nailpolish("Pink", "Revlon", "Matte", 200);
        Nailpolish nailpolish3 = new Nailpolish("Red", "Lakme", "Glossy", 150);

        boolean matchNailpolish = nailpolish1.equals(nailpolish2);
        boolean notMatchNailpolish = nailpolish3.equals(nailpolish2);

        System.out.println("Nailpolish match: " + matchNailpolish);
        System.out.println("Nailpolish not match: " + notMatchNailpolish);
        System.out.println("");

        Pillow pillow1 = new Pillow("Cotton", "Small", "White", 500);
        Pillow pillow2 = new Pillow("Memory Foam", "Large", "Blue", 1500);
        Pillow pillow3 = new Pillow("Cotton", "Small", "White", 500);

        boolean matchPillow = pillow1.equals(pillow2);
        boolean notMatchPillow = pillow3.equals(pillow2);

        System.out.println("Pillow match: " + matchPillow);
        System.out.println("Pillow not match: " + notMatchPillow);
        System.out.println("");

        Vehicle vehicle1 = new Vehicle("Car", "Toyota", 1000000, "Red");
        Vehicle vehicle2 = new Vehicle("Bike", "Honda", 75000, "Black");
        Vehicle vehicle3 = new Vehicle("Car", "Toyota", 1000000, "Red");

        boolean matchVehicle = vehicle1.equals(vehicle2);
        boolean notMatchVehicle = vehicle3.equals(vehicle2);

        System.out.println("Vehicle match: " + matchVehicle);
        System.out.println("Vehicle not match: " + notMatchVehicle);
        System.out.println("");

        Hand hand1 = new Hand("Medium", "Brown", "Right", 80);
        Hand hand2 = new Hand("Small", "Fair", "Left", 60);
        Hand hand3 = new Hand("Medium", "Brown", "Right", 80);

        boolean matchHand = hand1.equals(hand2);
        boolean notMatchHand = hand3.equals(hand2);

        System.out.println("Hand match: " + matchHand);
        System.out.println("Hand not match: " + notMatchHand);
        System.out.println("");

        Bird bird1 = new Bird("Sparrow", "Brown", 20.5, "Urban");
        Bird bird2 = new Bird("Eagle", "Black", 100.0, "Mountains");
        Bird bird3 = new Bird("Sparrow", "Brown", 20.5, "Urban");

        boolean matchBird = bird1.equals(bird2);
        boolean notMatchBird = bird3.equals(bird2);

        System.out.println("Bird match: " + matchBird);
        System.out.println("Bird not match: " + notMatchBird);
        System.out.println("");

        Tablet tablet1 = new Tablet("Apple", "iPad Air", 60000, "Silver");
        Tablet tablet2 = new Tablet("Samsung", "Galaxy Tab", 45000, "Black");
        Tablet tablet3 = new Tablet("Apple", "iPad Air", 60000, "Silver");

        boolean matchTablet = tablet1.equals(tablet2);
        boolean notMatchTablet = tablet3.equals(tablet2);

        System.out.println("Tablet match: " + matchTablet);
        System.out.println("Tablet not match: " + notMatchTablet);
        System.out.println("");

        Fan fan1 = new Fan("Havells", "Ceiling", 3, "White");
        Fan fan2 = new Fan("Orient", "Table", 5, "Black");
        Fan fan3 = new Fan("Havells", "Ceiling", 3, "White");

        boolean matchFan = fan1.equals(fan2);
        boolean notMatchFan = fan3.equals(fan2);

        System.out.println("Fan match: " + matchFan);
        System.out.println("Fan not match: " + notMatchFan);
        System.out.println("");

        Mat mat1 = new Mat("Rubber", "Medium", "Red", 300);
        Mat mat2 = new Mat("Cotton", "Large", "Blue", 400);
        Mat mat3 = new Mat("Rubber", "Medium", "Red", 300);

        boolean matchMat = mat1.equals(mat2);
        boolean notMatchMat = mat3.equals(mat2);

        System.out.println("Mat match: " + matchMat);
        System.out.println("Mat not match: " + notMatchMat);
        System.out.println("");

        Umbrella umbrella1 = new Umbrella("Black", "Large", "Nylon", 250);
        Umbrella umbrella2 = new Umbrella("Red", "Small", "Polyester", 200);
        Umbrella umbrella3 = new Umbrella("Black", "Large", "Nylon", 250);

        boolean matchUmbrella = umbrella1.equals(umbrella2);
        boolean notMatchUmbrella = umbrella3.equals(umbrella2);

        System.out.println("Umbrella match: " + matchUmbrella);
        System.out.println("Umbrella not match: " + notMatchUmbrella);
        System.out.println("");

        Clock clock1 = new Clock("Rolex", "Wall Clock", 5000, "Black");
        Clock clock2 = new Clock("Titan", "Table Clock", 3000, "White");
        Clock clock3 = new Clock("Rolex", "Wall Clock", 5000, "Black");

        boolean matchClock = clock1.equals(clock2);
        boolean notMatchClock = clock3.equals(clock2);

        System.out.println("Clock match: " + matchClock);
        System.out.println("Clock not match: " + notMatchClock);
        System.out.println("");

        Cloud cloud1 = new Cloud("Cumulus", "White", "Round", 3000.5);
        Cloud cloud2 = new Cloud("Stratus", "Grey", "Flat", 1500.2);
        Cloud cloud3 = new Cloud("Cumulus", "White", "Round", 3000.5);

        boolean matchCloud = cloud1.equals(cloud2);
        boolean notMatchCloud = cloud3.equals(cloud2);

        System.out.println("Cloud match: " + matchCloud);
        System.out.println("Cloud not match: " + notMatchCloud);
        System.out.println("");

        Apartment apartment1 = new Apartment("New York", 1000000, 1500, "John Doe");
        Apartment apartment2 = new Apartment("California", 850000, 1200, "Jane Doe");
        Apartment apartment3 = new Apartment("New York", 1000000, 1500, "John Doe");

        boolean matchApartment = apartment1.equals(apartment2);
        boolean notMatchApartment = apartment3.equals(apartment2);

        System.out.println("Apartment match: " + matchApartment);
        System.out.println("Apartment not match: " + notMatchApartment);
        System.out.println("");

        Cricket cricket1 = new Cricket("Virat Kohli", "RCB", 34, "Batsman");
        Cricket cricket2 = new Cricket("MS Dhoni", "CSK", 41, "Wicketkeeper");
        Cricket cricket3 = new Cricket("Virat Kohli", "RCB", 34, "Batsman");

        boolean matchCricket = cricket1.equals(cricket2);
        boolean notMatchCricket = cricket3.equals(cricket2);

        System.out.println("Cricket match: " + matchCricket);
        System.out.println("Cricket not match: " + notMatchCricket);
        System.out.println("");

        Cup cup1 = new Cup("Ceramic", "Medium", 250, "White");
        Cup cup2 = new Cup("Plastic", "Small", 100, "Red");
        Cup cup3 = new Cup("Ceramic", "Medium", 250, "White");

        boolean matchCup = cup1.equals(cup2);
        boolean notMatchCup = cup3.equals(cup2);

        System.out.println("Cup match: " + matchCup);
        System.out.println("Cup not match: " + notMatchCup);
        System.out.println("");

        Desk desk1 = new Desk("Wood", "Brown", 1200, 5000);
        Desk desk2 = new Desk("Metal", "Black", 800, 3000);
        Desk desk3 = new Desk("Wood", "Brown", 1200, 5000);

        boolean matchDesk = desk1.equals(desk2);
        boolean notMatchDesk = desk3.equals(desk2);

        System.out.println("Desk match: " + matchDesk);
        System.out.println("Desk not match: " + notMatchDesk);
        System.out.println("");


        Gold gold1 = new Gold("24K", "10g", "Yellow", 50000);
        Gold gold2 = new Gold("22K", "20g", "Yellow", 80000);
        Gold gold3 = new Gold("24K", "10g", "Yellow", 50000);

        boolean matchGold = gold1.equals(gold2);
        boolean notMatchGold = gold3.equals(gold2);

        System.out.println("Gold match: " + matchGold);
        System.out.println("Gold not match: " + notMatchGold);
        System.out.println("");

        Doll doll1 = new Doll("Barbie", "Plastic", "Pink", 1500);
        Doll doll2 = new Doll("Teddy", "Cotton", "Brown", 1000);
        Doll doll3 = new Doll("Barbie", "Plastic", "Pink", 1500);

        boolean matchDoll = doll1.equals(doll2);
        boolean notMatchDoll = doll3.equals(doll2);

        System.out.println("Doll match: " + matchDoll);
        System.out.println("Doll not match: " + notMatchDoll);
        System.out.println("");

        Door door1 = new Door("Wood", "Large", "Brown", 5000);
        Door door2 = new Door("Metal", "Medium", "Black", 3000);
        Door door3 = new Door("Wood", "Large", "Brown", 5000);

        boolean matchDoor = door1.equals(door2);
        boolean notMatchDoor = door3.equals(door2);

        System.out.println("Door match: " + matchDoor);
        System.out.println("Door not match: " + notMatchDoor);
        System.out.println("");

        Dress dress1 = new Dress("Red", "Medium", "Gucci", 25000);
        Dress dress2 = new Dress("Black", "Large", "Armani", 30000);
        Dress dress3 = new Dress("Red", "Medium", "Gucci", 25000);

        boolean matchDress = dress1.equals(dress2);
        boolean notMatchDress = dress3.equals(dress2);

        System.out.println("Dress match: " + matchDress);
        System.out.println("Dress not match: " + notMatchDress);
        System.out.println("");

        Engine engine1 = new Engine("Diesel", 120, "Mahindra", 100000);
        Engine engine2 = new Engine("Petrol", 150, "Honda", 200000);
        Engine engine3 = new Engine("Diesel", 120, "Mahindra", 100000);

        boolean matchEngine = engine1.equals(engine2);
        boolean notMatchEngine = engine3.equals(engine2);

        System.out.println("Engine match: " + matchEngine);
        System.out.println("Engine not match: " + notMatchEngine);
        System.out.println("");

        Pant pant1 = new Pant("Blue", "Medium", "Levis", 3000);
        Pant pant2 = new Pant("Black", "Large", "Wrangler", 2500);
        Pant pant3 = new Pant("Blue", "Medium", "Levis", 3000);

        boolean matchPant = pant1.equals(pant2);
        boolean notMatchPant = pant3.equals(pant2);

        System.out.println("Pant match: " + matchPant);
        System.out.println("Pant not match: " + notMatchPant);
        System.out.println("");

        Shirt shirt1 = new Shirt("White", "Medium", "Raymond", 2000);
        Shirt shirt2 = new Shirt("Blue", "Large", "Arrow", 1500);
        Shirt shirt3 = new Shirt("White", "Medium", "Raymond", 2000);

        boolean matchShirt = shirt1.equals(shirt2);
        boolean notMatchShirt = shirt3.equals(shirt2);

        System.out.println("Shirt match: " + matchShirt);
        System.out.println("Shirt not match: " + notMatchShirt);
        System.out.println("");

        Bag bag1 = new Bag("Nike", "Red", "Polyester", 4000);
        Bag bag2 = new Bag("Adidas", "Blue", "Canvas", 3500);
        Bag bag3 = new Bag("Nike", "Red", "Polyester", 4000);

        boolean matchBag = bag1.equals(bag2);
        boolean notMatchBag = bag3.equals(bag2);

        System.out.println("Bag match: " + matchBag);
        System.out.println("Bag not match: " + notMatchBag);
        System.out.println("");

        Plant plant1 = new Plant("Rose", "Short", "Red", 150);
        Plant plant2 = new Plant("Tulip", "Medium", "Yellow", 200);
        Plant plant3 = new Plant("Rose", "Short", "Red", 150);

        boolean matchPlant = plant1.equals(plant2);
        boolean notMatchPlant = plant3.equals(plant2);

        System.out.println("Plant match: " + matchPlant);
        System.out.println("Plant not match: " + notMatchPlant);

    }
}




