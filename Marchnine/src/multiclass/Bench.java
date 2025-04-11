package multiclass;

class Bench extends Park {
    public Bench() {
        System.out.println("invoking Bench");
    }
    @Override
    public void relax() {
        System.out.println("invoking relax in subclass");
    }

    public void support() {
        System.out.println("invoking support");
    }
}