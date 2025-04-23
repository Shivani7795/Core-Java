package internal;

public interface Browser {
    void loadPage();
    void refreshPage();
    void saveBookmark();
    void clearCache();
    void openNewTab();
    void closeTab();
    void viewHistory();
}
