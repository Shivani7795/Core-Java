package multiclass;

class Crop extends Field {
    public Crop() {
        System.out.println("invoking Crop");
    }
    @Override
    public void cultivate() {
        System.out.println("invoking cultivate in subclass");
    }

    public void harvest() {
        System.out.println("invoking harvest");
    }
}