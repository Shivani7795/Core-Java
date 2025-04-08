public class Electronics {
    int id;
    String name;
    String usedFor;
    boolean wired;
    double weight;
    boolean chargable;
    String material;
    int warranty;
    int price;
    boolean portable;

    public Electronics() {
    }

    public Electronics(int id) {
        this.id = id;
    }

    public Electronics(int id, String name) {
        this(id);
        this.name = name;
    }

    public Electronics(int id, String name, String usedFor) {
        this(id, name);
        this.usedFor = usedFor;
    }

    public Electronics(int id, String name, String usedFor, boolean wired) {
        this(id, name, usedFor);
        this.wired = wired;
    }

    public Electronics(int id, String name, String usedFor, boolean wired, double weight, boolean chargable, String material, int warranty, int price, boolean portable) {
        this(id, name, usedFor, wired);
        this.weight = weight;
        this.chargable = chargable;
        this.material = material;
        this.warranty = warranty;
        this.price = price;
        this.portable = portable;
    }

    public void displayDetails() {
        System.out.println("Electronics Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Used For: " + usedFor);
        System.out.println("Wired: " + wired);
        System.out.println("Weight: " + weight);
        System.out.println("Chargable: " + chargable);
        System.out.println("Material: " + material);
        System.out.println("Warranty: " + warranty);
        System.out.println("Price: " + price);
        System.out.println("Portable: " + portable);
        System.out.println("---------------------");
    }
}

