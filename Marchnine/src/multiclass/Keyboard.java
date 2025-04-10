package multiclass;

class Keyboard extends Laptop {
    public Keyboard() {
        System.out.println("invoking Keyboard");
    }
    @Override
    public void compute() {
        System.out.println("invoking compute in subclass");
    }

    public void type() {
        System.out.println("invoking type");
    }
}