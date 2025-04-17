package methodsequals;
import java.util.Objects;

public class Animal {
    private String name;
    private String species;
    private int age;
    private String habitat;

    public Animal(String name, String species, int age, String habitat) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name +
                ", species='" + species +
                ", age=" + age +
                ", habitat='" + habitat +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Animal) {
            Animal animal = (Animal) obj;
            if (Objects.equals(this.name, animal.name) &&
                    Objects.equals(this.species, animal.species) &&
                    Objects.equals(this.age, animal.age) &&
                    Objects.equals(this.habitat, animal.habitat)) {
                System.out.println("Animal is matching...");
                return true;
            }
        }
        return false;
    }
}

