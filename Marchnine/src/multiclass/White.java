package multiclass;

class White extends Light {
    public White() {
        System.out.println("invoking White");
    }

    @Override
    public void glow() {
        System.out.println("invoking glow method in White");
    }

    public void shine() {
        System.out.println("invoking shine in Subclass");
    }
}