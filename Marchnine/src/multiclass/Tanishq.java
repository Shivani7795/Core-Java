package multiclass;

class Tanishq extends Jewellery {
    public Tanishq() {
        System.out.println("invoking Tanishq");
    }
    @Override
    public void sparkle() {
        System.out.println("invoking sparkle in subclass");
    }

    public void brand() {
        System.out.println("invoking brand");
    }
}