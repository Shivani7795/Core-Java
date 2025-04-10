package multiclass;

class Eraser extends Pencil {
    public Eraser() {
        System.out.println("invoking Eraser");
    }
    @Override
    public void write() {
        System.out.println("invoking write in subclass");
    }

    public void erase() {
        System.out.println("invoking erase");
    }
}