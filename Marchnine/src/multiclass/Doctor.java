package multiclass;

class Doctor extends Hospital {
    public Doctor() {
        System.out.println("invoking Doctor");
    }
    @Override
    public void serve() {
        System.out.println("invoking serve in subclass");
    }

    public void treat() {
        System.out.println("invoking treat");
    }
}