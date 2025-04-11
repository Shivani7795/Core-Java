package multiclass;

class Screen extends Movie {
    public Screen() {
        System.out.println("invoking Screen");
    }
    @Override
    public void entertain() {
        System.out.println("invoking entertain in subclass");
    }

    public void display() {
        System.out.println("invoking display");
    }
}