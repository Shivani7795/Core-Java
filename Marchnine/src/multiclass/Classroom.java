package multiclass;

class Classroom extends School {
    public Classroom() {
        System.out.println("invoking Classroom");
    }
    @Override
    public void educate() {
        System.out.println("invoking educate in subclass");
    }

    public void teach() {
        System.out.println("invoking teach");
    }
}