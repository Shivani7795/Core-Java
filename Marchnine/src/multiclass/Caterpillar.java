package multiclass;

class Caterpillar extends Butterfly {
    public Caterpillar() {
        System.out.println("invoking Caterpillar");
    }
    @Override
    public void fly() {
        System.out.println("invoking fly in subclass");
    }

    public void crawl() {
        System.out.println("invoking crawl");
    }
}