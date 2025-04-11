package multiclass;

class Utensil extends Plate {
    public Utensil() {
        System.out.println("invoking Utensil");
    }
    @Override
    public void holdFood() {
        System.out.println("invoking holdFood in subclass");
    }

    public void serve() {
        System.out.println("invoking serve");
    }
}
