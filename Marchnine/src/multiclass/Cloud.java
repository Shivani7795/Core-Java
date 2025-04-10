package multiclass;

class Cloud extends Sky {
    public Cloud() {
        System.out.println("invoking Cloud");
    }
    @Override
    public void shine() {
        System.out.println("invoking shine in subclass");
    }

    public void rain() {
        System.out.println("invoking rain");
    }
}