package multiclass;

class Path extends Road {
    public Path() {
        System.out.println("invoking Path");
    }
    @Override
    public void connect() {
        System.out.println("invoking connect in subclass");
    }

    public void lead() {
        System.out.println("invoking lead");
    }
}
