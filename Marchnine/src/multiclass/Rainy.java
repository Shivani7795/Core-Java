package multiclass;

class Rainy extends Weather {
    public Rainy() {
        System.out.println("invoking Rainy");
    }
    @Override
    public void forecast() {
        System.out.println("invoking forecast in subclass");
    }

    public void pour() {
        System.out.println("invoking pour");
    }
}