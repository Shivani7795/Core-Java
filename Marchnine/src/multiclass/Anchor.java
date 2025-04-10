package multiclass;

class Anchor extends Ship {
    public Anchor() {
        System.out.println("invoking Anchor");
    }
    @Override
    public void sail() {
        System.out.println("invoking sail in subclass");
    }

    public void stabilize() {
        System.out.println("invoking stabilize");
    }
}