package multiclass;

class Steel extends Table {
    public Steel() {
        System.out.println("invoking Steel");
    }

    @Override
    public void support() {
        System.out.println("invoking support method in Steel");
    }

    public void durability() {
        System.out.println("invoking durability in Subclass");
    }
}