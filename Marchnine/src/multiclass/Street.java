package multiclass;

class Street extends City {
    public Street() {
        System.out.println("invoking Street");
    }
    @Override
    public void grow() {
        System.out.println("invoking grow in subclass");
    }

    public void connect() {
        System.out.println("invoking connect");
    }
}