package multiclass;

class Umbrella extends Rain {
    public Umbrella() {
        System.out.println("invoking Umbrella");
    }
    @Override
    public void pour() {
        System.out.println("invoking pour in subclass");
    }

    public void shelter() {
        System.out.println("invoking shelter");
    }
}