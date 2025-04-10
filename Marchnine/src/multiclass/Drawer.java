package multiclass;

class Drawer extends Desk {
    public Drawer() {
        System.out.println("invoking Drawer");
    }
    @Override
    public void organize() {
        System.out.println("invoking organize in subclass");
    }

    public void store() {
        System.out.println("invoking store");
    }
}