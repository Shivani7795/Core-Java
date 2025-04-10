package multiclass;

class Peak extends Mountain {
    public Peak() {
        System.out.println("invoking Peak");
    }
    @Override
    public void standTall() {
        System.out.println("invoking standTall in subclass");
    }

    public void reach() {
        System.out.println("invoking reach");
    }
}