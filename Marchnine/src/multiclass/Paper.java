package multiclass;

class Paper extends Book {
    public Paper() {
        System.out.println("invoking Paper");
    }

    @Override
    public void read() {
        System.out.println("invoking read method in Paper");
    }

    public void write() {
        System.out.println("invoking write in Subclass");
    }
}