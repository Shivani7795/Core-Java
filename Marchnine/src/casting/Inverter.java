package casting;

public class Inverter extends Generator {
    public Inverter(){

    }
    public void generate(){
        System.out.println("invoking Generate in subclass");
    }
    public void backup(){
        System.out.println("invoking backup in Subclass");
    }
}

