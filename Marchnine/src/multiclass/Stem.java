package multiclass;

class Stem extends Plant {
    public Stem() {
        System.out.println("invoking Stem");
    }
    @Override
    public void grow() {
        System.out.println("invoking grow in subclass");
    }

    public void support() {
        System.out.println("invoking support");
    }
}