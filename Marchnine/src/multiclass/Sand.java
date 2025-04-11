package multiclass;

class Sand extends Beach {
    public Sand() {
        System.out.println("invoking Sand");
    }
    @Override
    public void relax() {
        System.out.println("invoking relax in subclass");
    }

    public void scatter() {
        System.out.println("invoking scatter");
    }
}