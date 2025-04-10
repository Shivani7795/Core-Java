package multiclass;

class Tablet extends Medicine {
    public Tablet() {
        System.out.println("invoking Tablet");
    }
    @Override
    public void heal() {
        System.out.println("invoking heal in subclass");
    }

    public void dissolve() {
        System.out.println("invoking dissolve");
    }
}