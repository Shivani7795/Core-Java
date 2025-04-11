package multiclass;

class Performer extends Stage {
    public Performer() {
        System.out.println("invoking Performer");
    }
    @Override
    public void present() {
        System.out.println("invoking present in subclass");
    }

    public void act() {
        System.out.println("invoking act");
    }
}