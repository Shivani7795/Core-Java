package multiclass;

class Hut extends Village {
    public Hut() {
        System.out.println("invoking Hut");
    }
    @Override
    public void exist() {
        System.out.println("invoking exist in subclass");
    }

    public void shelter() {
        System.out.println("invoking shelter");
    }
}
