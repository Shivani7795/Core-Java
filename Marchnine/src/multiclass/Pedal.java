package multiclass;

class Pedal extends Bike {
    public Pedal() {
        System.out.println("invoking Pedal");
    }
    @Override
    public void move() {
        System.out.println("invoking move in subclass");
    }

    public void rotate() {
        System.out.println("invoking rotate");
    }
    public void cBike(Bike bike) {
        if (bike != null) {
            bike.move();//???
            if (bike instanceof Pedal) {
                Pedal pedal = (Pedal) bike;//casting
                pedal.rotate();
            } else {
                System.err.println("Pedal is not in Bike");
            }
        } else {
            System.err.println("Bike is null..");
        }
    }
}
