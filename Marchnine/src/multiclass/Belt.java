package multiclass;

class Belt extends Pant {
    public Belt() {
        System.out.println("invoking Belt");
    }
    @Override
    public void jeans() {
        System.out.println("invoking jeans subclass");
    }

    public void Belty() {
        System.out.println("invoking Belty");
    }
}