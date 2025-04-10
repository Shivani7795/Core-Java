package multiclass;

class Iron extends Electric {
    public Iron() {
        System.out.println("invoking Iron");
    }
    @Override
    public void powerOn() {
        System.out.println("invoking powerOn in subclass");
    }

    public void press() {
        System.out.println("invoking press");
    }
}