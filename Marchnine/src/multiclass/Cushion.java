package multiclass;

class Cushion extends Sofa {
    public Cushion() {
        System.out.println("invoking Cushion");
    }
    @Override
    public void relax() {
        System.out.println("invoking relax in subclass");
    }

    public void fluff() {
        System.out.println("invoking fluff");
    }
}