package external;

import internal.Book;

public class Novel implements Book {
    public void openPage() {
        System.out.println("Novel opened.");
    }

    public void readPage() {
        System.out.println("Reading page of the novel.");
    }

    public void closeBook() {
        System.out.println("Novel closed.");
    }
}
