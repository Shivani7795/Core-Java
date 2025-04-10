package multiclass;

class Wire extends Charger {
    public Wire() {
        System.out.println("invoking Wire");
    }
    @Override
    public void white(){
        System.out.println("invoking white in subclass");
    }

    public void Wiry() {
        System.out.println("invoking Wiry");
    }
}