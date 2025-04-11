package multiclass;

class Lily extends Pond {
    public Lily() {
        System.out.println("invoking Lily");
    }
    @Override
    public void reflect() {
        System.out.println("invoking reflect in subclass");
    }

    public void bloom() {
        System.out.println("invoking bloom");
    }
}