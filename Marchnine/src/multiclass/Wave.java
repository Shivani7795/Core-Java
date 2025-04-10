package multiclass;

class Wave extends Ocean {
    public Wave() {
        System.out.println("invoking Wave");
    }
    @Override
    public void move() {
        System.out.println("invoking move in subclass");
    }

    public void crash() {
        System.out.println("invoking crash");
    }
}