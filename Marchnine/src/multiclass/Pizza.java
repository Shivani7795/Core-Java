package multiclass;

class Pizza extends Snack {
    public Pizza() {
        System.out.println("invoking Pizza");
    }
    @Override
    public void eat() {
        System.out.println("invoking eat in subclass");
    }

    public void slice() {
        System.out.println("invoking slice");
    }
}