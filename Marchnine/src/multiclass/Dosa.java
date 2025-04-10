package multiclass;

class Dosa extends Food {
    public Dosa() {
        System.out.println("invoking Dosa");
    }
    @Override
    public void prepare() {
        System.out.println("invoking prepare in subclass");
    }

    public void serve() {
        System.out.println("invoking serve");
    }
}