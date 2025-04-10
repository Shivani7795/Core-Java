package multiclass;

class Hand extends Clock {
    public Hand() {
        System.out.println("invoking Hand");
    }
    @Override
    public void tick() {
        System.out.println("invoking tick in subclass");
    }

    public void point() {
        System.out.println("invoking point");
    }
}