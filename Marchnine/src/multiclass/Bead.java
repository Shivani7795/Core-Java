package multiclass;

class Bead extends Bracelete {
    public Bead() {
        System.out.println("invoking Bead");
    }
    @Override
    public void thread(){
        System.out.println("invoking thread in subclass");
    }

    public void Beady() {
        System.out.println("invoking Beady");
    }
}


