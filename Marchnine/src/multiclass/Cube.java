package multiclass;

class Cube extends Ice {
    public Cube() {
        System.out.println("invoking Cube");
    }
    @Override
    public void freeze() {
        System.out.println("invoking freeze in subclass");
    }

    public void melt() {
        System.out.println("invoking melt");
    }
}
