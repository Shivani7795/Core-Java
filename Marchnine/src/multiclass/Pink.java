package multiclass;

class Pink extends Colour {
    public Pink() {
        System.out.println("invoking Pink");
    }
    @Override
    public void paint() {
        System.out.println("invoking paint in subclass");
    }

    public void shade() {
        System.out.println("invoking shade");
    }
}