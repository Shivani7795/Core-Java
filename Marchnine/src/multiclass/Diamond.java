package multiclass;

class Diamond extends Ring {
    public Diamond() {
        System.out.println("invoking Diamond");
    }
    @Override
    public void adorn() {
        System.out.println("invoking adorn in subclass");
    }

    public void sparkle() {
        System.out.println("invoking sparkle");
    }
}