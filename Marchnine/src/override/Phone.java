package override;

class Phone extends Electronic {
    public Phone() {
        System.out.println("invoking Phone");
    }

    public void Call() {
        System.out.println("invoking Call");
    }
}