package multiclass;

class Painting extends Canvas {
    public Painting() {
        System.out.println("invoking Painting");
    }
    @Override
    public void display() {
        System.out.println("invoking display in subclass");
    }

    public void create() {
        System.out.println("invoking create");
    }
}
