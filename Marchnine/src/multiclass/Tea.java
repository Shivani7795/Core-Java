package multiclass;

class Tea extends Cup {
    public Tea() {
        System.out.println("invoking Tea");
    }
    @Override
    public void fill() {
        System.out.println("invoking fill in subclass");
    }

    public void brew() {
        System.out.println("invoking brew");
    }
}