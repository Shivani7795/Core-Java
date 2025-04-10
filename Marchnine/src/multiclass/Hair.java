package multiclass;

class Hair extends Hairstyle {
    public Hair() {
        System.out.println("invoking Hair");
    }
    @Override
    public void style() {
        System.out.println("invoking style in subclass");
    }

    public void comb() {
        System.out.println("invoking comb");
    }
}