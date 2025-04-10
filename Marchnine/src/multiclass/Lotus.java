package multiclass;

class Lotus extends Flower {
    public Lotus() {
        System.out.println("invoking Lotus");
    }
    @Override
    public void bloom() {
        System.out.println("invoking bloom in subclass");
    }

    public void floatOnWater() {
        System.out.println("invoking floatOnWater");
    }
}