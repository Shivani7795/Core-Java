package multiclass;

class Beam extends Sun {
    public Beam() {
        System.out.println("invoking Beam");
    }
    @Override
    public void shine() {
        System.out.println("invoking shine in subclass");
    }

    public void illuminate() {
        System.out.println("invoking illuminate");
    }
}