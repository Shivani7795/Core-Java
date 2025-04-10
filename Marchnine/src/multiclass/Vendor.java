package multiclass;

class Vendor extends Market {
    public Vendor() {
        System.out.println("invoking Vendor");
    }
    @Override
    public void sell() {
        System.out.println("invoking sell in subclass");
    }

    public void bargain() {
        System.out.println("invoking bargain");
    }
}