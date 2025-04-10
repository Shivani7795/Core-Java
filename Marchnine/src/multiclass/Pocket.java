package multiclass;

class Pocket extends Shirt {
    public Pocket() {
        System.out.println("invoking Pocket");
    }

    @Override
    public void wear() {
        System.out.println("invoking wear method in Pocket");
    }

    public void store() {
        System.out.println("invoking store in Subclass");
    }
}