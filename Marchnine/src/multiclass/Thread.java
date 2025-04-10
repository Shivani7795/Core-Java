package multiclass;

class Thread extends Carpet {
    public Thread() {
        System.out.println("invoking Thread");
    }
    @Override
    public void cover() {
        System.out.println("invoking cover in subclass");
    }

    public void weave() {
        System.out.println("invoking weave");
    }
}