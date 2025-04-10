package multiclass;

class Galaxy extends Star {
    public Galaxy() {
        System.out.println("invoking Galaxy");
    }
    @Override
    public void shine() {
        System.out.println("invoking shine in subclass");
    }

    public void expand() {
        System.out.println("invoking expand");
    }
}