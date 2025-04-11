package multiclass;

class Luggage extends Suitcase {
    public Luggage() {
        System.out.println("invoking Luggage");
    }
    @Override
    public void carry() {
        System.out.println("invoking carry in subclass");
    }

    public void pack() {
        System.out.println("invoking pack");
    }
}