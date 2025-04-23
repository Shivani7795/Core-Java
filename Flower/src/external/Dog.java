package external;
import internal.Animal;

public class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    public void sound() {
        System.out.println("Dog is barking.");
    }

    public void move() {
        System.out.println("Dog is running.");
    }

    public void reproduce() {
        System.out.println("Dog is reproducing.");
    }
}
