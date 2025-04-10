package multiclass;

class Bat extends Cricket {
    public Bat() {
        System.out.println("invoking Bat");
    }
    @Override
    public void play() {
        System.out.println("invoking play in subclass");
    }

    public void hit() {
        System.out.println("invoking hit");
    }
}