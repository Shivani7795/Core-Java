package multiclass;

class Compartment extends Train {
    public Compartment() {
        System.out.println("invoking Compartment");
    }
    @Override
    public void run() {
        System.out.println("invoking run in subclass");
    }

    public void carry() {
        System.out.println("invoking carry");
    }
}