package multiclass;

class Soldier extends Army {
    public Soldier() {
        System.out.println("invoking Soldier");
    }
    @Override
    public void defend() {
        System.out.println("invoking defend in subclass");
    }

    public void attack() {
        System.out.println("invoking attack");
    }
}