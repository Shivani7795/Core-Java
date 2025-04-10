package multiclass;

class Apple extends Fruit {
    public Apple() {
        System.out.println("invoking Apple");
    }
    @Override
    public void taste() {
        System.out.println("invoking taste in subclass");
    }

    public void crunch() {
        System.out.println("invoking crunch");
    }
}