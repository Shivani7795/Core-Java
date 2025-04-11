package multiclass;

class Fence extends Garden {
    public Fence() {
        System.out.println("invoking Fence");
    }
    @Override
    public void nurture() {
        System.out.println("invoking nurture in subclass");
    }

    public void protect() {
        System.out.println("invoking protect");
    }
}