package multiclass;

class Photo extends Album {
    public Photo() {
        System.out.println("invoking Photo");
    }

    @Override
    public void size() {
        System.out.println("invoking size in subclass");
    }

    public void edit() {
        System.out.println("invoking edit");
    }
}