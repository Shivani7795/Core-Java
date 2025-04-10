package multiclass;

class Carbon extends Elements {
    public Carbon() {
        System.out.println("invoking Carbon");
    }
    @Override
    public void bond() {
        System.out.println("invoking bond in subclass");
    }

    public void compound() {
        System.out.println("invoking compound");
    }
}