package multiclass;

class Rent extends House {
    public Rent() {
        System.out.println("invoking Rent");
    }
    @Override
    public void build() {
        System.out.println("invoking build in subclass");
    }

    public void lease() {
        System.out.println("invoking lease");
    }
}