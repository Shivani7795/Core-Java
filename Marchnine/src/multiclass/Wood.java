package multiclass;

class Wood extends Door {
    public Wood() {
        System.out.println("invoking Wood");
    }

    @Override
    public void open() {
        System.out.println("invoking open method in Wood");
    }

    public void polish() {
        System.out.println("invoking polish in Subclass");
    }
}