package multiclass;

class Pushup extends Gym {
    public Pushup() {
        System.out.println("invoking Pushup");
    }
    @Override
    public void workout() {
        System.out.println("invoking workout in subclass");
    }

    public void strengthen() {
        System.out.println("invoking strengthen");
    }
}