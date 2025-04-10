package multiclass;

class Shelf extends Cupboard {
    public Shelf() {
        System.out.println("invoking Shelf");
    }
    @Override
    public void store() {
        System.out.println("invoking store in subclass");
    }

    public void organize() {
        System.out.println("invoking organize");
    }
}