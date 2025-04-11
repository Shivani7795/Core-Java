package multiclass;

class File extends Folder {
    public File() {
        System.out.println("invoking File");
    }
    @Override
    public void store() {
        System.out.println("invoking store in subclass");
    }

    public void edit() {
        System.out.println("invoking edit");
    }
}