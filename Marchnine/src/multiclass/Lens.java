package multiclass;

class Lens extends Camera {
    public Lens() {
        System.out.println("invoking Lens");
    }
    @Override
    public void capture() {
        System.out.println("invoking capture in subclass");
    }

    public void zoom() {
        System.out.println("invoking zoom");
    }
}