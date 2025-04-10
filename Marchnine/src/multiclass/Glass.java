package multiclass;

class Glass extends Window {
    public Glass() {
        System.out.println("invoking Glass");
    }
    @Override
    public void square(){
        System.out.println("invoking square in sub class ");
    }
    public void Transparent() {
        System.out.println("invoking Transparent");
    }
}