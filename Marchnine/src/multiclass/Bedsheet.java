package multiclass;

class Bedsheet extends Bed {
    public Bedsheet() {
        System.out.println("invoking Bedsheet");
    }
    @Override
    public void size(){
        System.out.println("invoking size in sub class");
    }

    public void Sheets() {
        System.out.println("invoking Sheets");
    }
}