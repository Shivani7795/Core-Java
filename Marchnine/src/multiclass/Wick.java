package multiclass;

class Wick extends Candle {
    public Wick() {
        System.out.println("invoking Wick");
    }
    @Override
    public void lightUp() {
        System.out.println("invoking lightUp in subclass");
    }

    public void burn() {
        System.out.println("invoking burn");
    }
}