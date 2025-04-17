package methods;
import java.util.Objects;

public class Army {
    private String divisionName;
    private int soldiersCount;
    private String country;
    private String specialSkill;

    public Army(String divisionName, int soldiersCount, String country, String specialSkill) {
        this.divisionName = divisionName;
        this.soldiersCount = soldiersCount;
        this.country = country;
        this.specialSkill = specialSkill;
    }

    @Override
    public String toString() {
        return "Army{" +
                "divisionName='" + divisionName +
                ", soldiersCount=" + soldiersCount +
                ", country='" + country +
                ", specialSkill='" + specialSkill +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Army) {
            Army army = (Army) obj;
            if (Objects.equals(this.divisionName, army.divisionName) &&
                    Objects.equals(this.soldiersCount, army.soldiersCount) &&
                    Objects.equals(this.country, army.country) &&
                    Objects.equals(this.specialSkill, army.specialSkill)) {
                System.out.println("Army is matching...");
                return true;
            }
        }
        return false;
    }
}

