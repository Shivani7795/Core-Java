package multiclass;

class Teeth extends Toothpaste {
    public Teeth() {
        System.out.println("invoking Teeth");
    }
    @Override
    public void clean() {
        System.out.println("invoking clean in subclass");
    }

    public void shine() {
        System.out.println("invoking shine");
    }
}