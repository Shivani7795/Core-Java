package internal;

public interface Game {
    void startGame();
    void pauseGame();
    void endGame();
    void saveProgress();
    void loadProgress();
    void restartGame();
    void viewScore();
}
