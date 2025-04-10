package multiclass;

class King extends Kingdom {
    public King() {
        System.out.println("invoking King");
    }
    @Override
    public void rule() {
        System.out.println("invoking rule in subclass");
    }

    public void crown() {
        System.out.println("invoking crown");
    }
}