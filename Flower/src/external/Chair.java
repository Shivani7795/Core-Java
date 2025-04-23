package external;

import internal.Furniture;

public class Chair implements Furniture {
    public void assemble() {
        System.out.println("Chair assembled.");
    }
    public void disassemble() {
        System.out.println("Chair disassembled.");
    }
    public void polish() {
        System.out.println("Chair polished.");
    }
    public void repaint() {
        System.out.println("Chair repainted.");
    }
    public void replaceParts() {
        System.out.println("Parts of chair replaced.");
    }
    public void adjustHeight() {
        System.out.println("Chair height adjusted.");
    }
    public void measureDimensions() {
        System.out.println("Chair dimensions measured.");
    }
}
