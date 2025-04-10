package multiclass;

class Brush extends Paint {
    public Brush() {
        System.out.println("invoking Brush");
    }
    @Override
    public void color() {
        System.out.println("invoking color in subclass");
    }

    public void stroke() {
        System.out.println("invoking stroke");
    }
}