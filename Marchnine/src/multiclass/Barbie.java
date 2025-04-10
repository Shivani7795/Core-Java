package multiclass;

class Barbie extends Doll {
    public Barbie() {
        System.out.println("invoking Barbie");
    }

    @Override
    public void play() {
        System.out.println("invoking play method in Barbie");
    }

    public void dressUp() {
        System.out.println("invoking dressUp in Subclass");
    }
}