package methodsequalssetters;

import java.util.Objects;

class Cricket {
    private String player;
    private String team;
    private int age;
    private String role;

    public Cricket(String player, String team, int age, String role) {
        this.setPlayer(player);
        this.setTeam(team);
        this.setAge(age);
        this.setRole(role);
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Cricket [Player=" + player + ", Team=" + team + ", Age=" + age + ", Role=" + role + "]";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Cricket) {
            Cricket cricket = (Cricket) anything;
            if (Objects.equals(this.player, cricket.player) &&
                    Objects.equals(this.team, cricket.team)) {
                System.out.println("Cricket player is matching..");
                return true;
            }
        }
        return false;
    }
}
