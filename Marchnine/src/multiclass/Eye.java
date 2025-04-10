package multiclass;

class Eye extends Face {
    public Eye() {
        System.out.println("invoking Eye");
    }
    @Override
    public void express() {
        System.out.println("invoking express in subclass");
    }

    public void blink() {
        System.out.println("invoking blink");
    }
}