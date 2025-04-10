package multiclass;

class Football extends Game {
    public Football() {
        System.out.println("invoking Football");
    }
    @Override
    public void compete() {
        System.out.println("invoking compete in subclass");
    }

    public void kick() {
        System.out.println("invoking kick");
    }
}