package multiclass;

class NailPolish extends Nail {
    public NailPolish() {
        System.out.println("invoking NailPolish");
    }
    @Override
    public void paint(){
        System.out.println("invoking paint in sub class");
    }

    public void Polish() {
        System.out.println("invoking Polish");
    }
}