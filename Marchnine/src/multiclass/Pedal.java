package multiclass;

class Pedal extends Bike {
    public Pedal() {
        System.out.println("invoking Pedal");
    }
    @Override
    public void move() {
        System.out.println("invoking move in subclass");
    }

    public void rotate() {
        System.out.println("invoking rotate");
    }
}