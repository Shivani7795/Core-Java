package multiclass;

class Lehenga extends Dress {
    public Lehenga() {
        System.out.println("invoking Lehenga");
    }
    @Override
    public void wear() {
        System.out.println("invoking wear in subclass");
    }

    public void twirl() {
        System.out.println("invoking twirl");
    }
}