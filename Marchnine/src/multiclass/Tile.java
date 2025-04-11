package multiclass;

class Tile extends Roof {
    public Tile() {
        System.out.println("invoking Tile");
    }
    @Override
    public void protect() {
        System.out.println("invoking protect in subclass");
    }

    public void insulate() {
        System.out.println("invoking insulate");
    }
}