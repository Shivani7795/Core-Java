package multiclass;

class Square extends Box {
    public Square() {
        System.out.println("invoking Square");
    }

    @Override
    public void pack() {
        System.out.println("invoking pack method in Square");
    }

    public void stack() {
        System.out.println("invoking stack in Subclass");
    }
}