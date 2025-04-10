package multiclass;

class Lips extends Lipstick {
    public Lips() {
        System.out.println("invoking Lips");
    }
    @Override
    public void colorLips() {
        System.out.println("invoking colorLips in subclass");
    }

    public void smile() {
        System.out.println("invoking smile");
    }
}