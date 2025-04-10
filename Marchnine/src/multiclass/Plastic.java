package multiclass;

class Plastic extends Chair {
    public Plastic() {
        System.out.println("invoking Plastic");
    }
    @Override
    public void addchair() {
        System.out.println("invoking addchair method in Plastic ");
    }

    public void Flex() {
        System.out.println("invoking Flex in Subclass");
    }
}

