package multiclass;

class Fish extends Lake {
    public Fish() {
        System.out.println("invoking Fish");
    }
    @Override
    public void provide() {
        System.out.println("invoking provide in subclass");
    }

    public void swim() {
        System.out.println("invoking swim");
    }
}