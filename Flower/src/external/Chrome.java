package external;

import internal.Browser;

public class Chrome implements Browser {
    public void loadPage() {
        System.out.println("Page loaded in Chrome.");
    }
    public void refreshPage() {
        System.out.println("Page refreshed in Chrome.");
    }
    public void saveBookmark() {
        System.out.println("Bookmark saved in Chrome.");
    }
    public void clearCache() {
        System.out.println("Cache cleared in Chrome.");
    }
    public void openNewTab() {
        System.out.println("New tab opened in Chrome.");
    }
    public void closeTab() {
        System.out.println("Tab closed in Chrome.");
    }
    public void viewHistory() {
        System.out.println("Viewing history in Chrome.");
    }
}
