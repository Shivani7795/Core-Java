package multiclass;

class Cupcake extends Cake {
    public Cupcake() {
        System.out.println("invoking Cupcake");
    }

    @Override
    public void bakeCake() {
        System.out.println("invoking bakeCake method in Cupcake");
    }

    public void Frost() {
        System.out.println("invoking Frost in Subclass");
    }
}
