package multiclass;

class Building extends Skyline {
    public Building() {
        System.out.println("invoking Building");
    }
    @Override
    public void rise() {
        System.out.println("invoking rise in subclass");
    }

    public void tower() {
        System.out.println("invoking tower");
    }
}