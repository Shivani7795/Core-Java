package multiclass;

class Channel extends TV {
    public Channel() {
        System.out.println("invoking Channel");
    }

    @Override
    public void watch() {
        System.out.println("invoking watch method in Channel");
    }

    public void broadcast() {
        System.out.println("invoking broadcast in Subclass");
    }
}