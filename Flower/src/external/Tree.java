package external;

import internal.Plant;
import

public class Tree implements Plant {
    public void grow() {
        System.out.println("Tree is growing.");
    }

    public void photosynthesize() {
        System.out.println("Tree is photosynthesizing.");
    }

    public void absorbWater() {
        System.out.println("Tree is absorbing water.");
    }

    public void produceOxygen() {
        System.out.println("Tree is producing oxygen.");
    }

    public void bloom() {
        System.out.println("Tree is blooming.");
    }
}
