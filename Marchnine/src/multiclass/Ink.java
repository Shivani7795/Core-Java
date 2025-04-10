package multiclass;

class Ink extends Pen {
    public Ink() {
        System.out.println("invoking Ink");
    }
    @Override
    public void write() {
        System.out.println("invoking write in subclass");
    }

    public void refill() {
        System.out.println("invoking refill");
    }
}