package multiclass;

class Cotton extends Pillow {
    public Cotton() {
        System.out.println("invoking Cotton");
    }
    @Override
    public void square(){
        System.out.println("invoking square in subclass");
    }

    public void Cottony() {
        System.out.println("invoking Cottony");
    }
}