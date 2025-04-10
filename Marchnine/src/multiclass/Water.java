package multiclass;

class Water extends Bottle {
    public Water() {
        System.out.println("invoking Water");
    }
    @Override
    public void plastic(){
    System.out.println("invoking palstic in sub class");
}

    public void Watery() {
        System.out.println("invoking Watery");
    }
}
