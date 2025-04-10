package multiclass;

class Gold extends Malabar {
    public Gold() {
        System.out.println("invoking Gold");
    }
    @Override
    public void trade() {
        System.out.println("invoking trade in subclass");
    }

    public void purity() {
        System.out.println("invoking purity");
    }
}