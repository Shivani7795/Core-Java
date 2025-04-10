package multiclass;

class Monitor extends Computer {
    public Monitor() {
        System.out.println("invoking Monitor");
    }
    @Override
    public void mouse(){
        System.out.println("invoking mouse in subclass");
    }

    public void Display() {
        System.out.println("invoking Display");
    }
}