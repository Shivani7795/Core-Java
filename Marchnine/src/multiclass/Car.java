package multiclass;

class Car extends Vehicle {
    public Car() {
        System.out.println("invoking Car");
    }
    @Override
    public void drive() {
        System.out.println("invoking drive in subclass");
    }

    public void honk() {
        System.out.println("invoking honk");
    }
}