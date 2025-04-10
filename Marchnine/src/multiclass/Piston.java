package multiclass;

class Piston extends Engine {
    public Piston() {
        System.out.println("invoking Piston");
    }
    @Override
    public void run() {
        System.out.println("invoking run in subclass");
    }

    public void move() {
        System.out.println("invoking move");
    }
}