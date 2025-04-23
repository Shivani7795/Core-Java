package external;

import internal.SportsTeam;

public class FootballTeam implements SportsTeam {
    public void train() {
        System.out.println("Football team is training.");
    }

    public void playMatch() {
        System.out.println("Football team is playing a match.");
    }

    public void recruitPlayers() {
        System.out.println("Football team is recruiting players.");
    }

    public void analyzePerformance() {
        System.out.println("Football team is analyzing performance.");
    }

    public void holdMeeting() {
        System.out.println("Football team is holding a meeting.");
    }
}
