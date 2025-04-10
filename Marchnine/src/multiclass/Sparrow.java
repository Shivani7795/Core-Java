package multiclass;

class Sparrow extends Bird {
    public Sparrow() {
        System.out.println("invoking Sparrow");
    }
    @Override
    public void fly() {
        System.out.println("invoking fly in subclass");
    }

    public void chirp() {
        System.out.println("invoking chirp");
    }
}