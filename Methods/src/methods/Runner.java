package methods;
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


    }
}