
package multiclass;

class Leaf extends Tree {
    public Leaf() {
        System.out.println("invoking Leaf");
    }
    @Override
    public void grow() {
        System.out.println("invoking grow in subclass");
    }

    public void photosynthesize() {
        System.out.println("invoking photosynthesize");
    }
}