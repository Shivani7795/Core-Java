package multiclass;

class Phone extends Electronic {
    public Phone() {
        System.out.println("invoking Phone");
    }
    @Override
    public void device(){
        System.out.println("invoking device in sub class");
    }

    public void Call() {
        System.out.println("invoking Call");
    }
}