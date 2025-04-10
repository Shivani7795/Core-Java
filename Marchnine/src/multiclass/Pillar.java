package multiclass;

class Pillar extends Bridge {
    public Pillar() {
        System.out.println("invoking Pillar");
    }
    @Override
    public void support() {
        System.out.println("invoking support in subclass");
    }

    public void strengthen() {
        System.out.println("invoking strengthen");
    }
}