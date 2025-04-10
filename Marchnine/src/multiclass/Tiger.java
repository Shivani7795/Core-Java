package multiclass;

class Tiger extends Animal {
    public Tiger() {
        System.out.println("invoking Tiger");
    }
    @Override
    public void roam() {
        System.out.println("invoking roam in subclass");
    }

    public void hunt() {
        System.out.println("invoking hunt");
    }
}