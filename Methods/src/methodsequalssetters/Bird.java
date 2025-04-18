package methodsequalssetters;

import java.util.Objects;

class Bird {
    private String species;
    private String color;
    private double wingspan;
    private String habitat;

    public Bird(String species, String color, double wingspan, String habitat) {
        this.setSpecies(species);
        this.setColor(color);
        this.setWingspan(wingspan);
        this.setHabitat(habitat);
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Bird [Species=" + species + ", Color=" + color + ", Wingspan=" + wingspan + ", Habitat=" + habitat + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Bird) {
            Bird bird = (Bird) anything;
            if (Objects.equals(this.species, bird.species) &&
                    Objects.equals(this.color, bird.color)) {
                System.out.println("Bird is matching..");
                return true;
            }
        }
        return false;
    }
}