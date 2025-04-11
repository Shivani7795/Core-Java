package multiclass;

class Rock extends Hill {
    public Rock() {
        System.out.println("invoking Rock");
    }
    @Override
    public void elevate() {
        System.out.println("invoking elevate in subclass");
    }

    public void standFirm() {
        System.out.println("invoking standFirm");
    }
}