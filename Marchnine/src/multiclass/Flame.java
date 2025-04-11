package multiclass;

class Flame extends Fire {
    public Flame() {
        System.out.println("invoking Flame");
    }
    @Override
    public void ignite() {
        System.out.println("invoking ignite in subclass");
    }

    public void burn() {
        System.out.println("invoking burn");
    }
}