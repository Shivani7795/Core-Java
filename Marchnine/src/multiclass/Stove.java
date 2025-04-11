package multiclass;

class Stove extends Kitchen {
    public Stove() {
        System.out.println("invoking Stove");
    }
    @Override
    public void cook() {
        System.out.println("invoking cook in subclass");
    }

    public void heat() {
        System.out.println("invoking heat");
    }
}