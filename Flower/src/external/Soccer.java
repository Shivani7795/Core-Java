package external;

import internal.Game;

public class Soccer implements Game {
    public void startGame() {
        System.out.println("Soccer game started.");
    }
    public void pauseGame() {
        System.out.println("Soccer game paused.");
    }
    public void endGame() {
        System.out.println("Soccer game ended.");
    }
    public void saveProgress() {
        System.out.println("Soccer game progress saved.");
    }
    public void loadProgress() {
        System.out.println("Soccer game progress loaded.");
    }
    public void restartGame() {
        System.out.println("Soccer game restarted.");
    }
    public void viewScore() {
        System.out.println("Viewing score in Soccer game.");
    }
}
