package external;

import internal.Library;

public class PublicLibrary implements Library {
    public void borrowBook() {
        System.out.println("Book borrowed from Public Library.");
    }
    public void returnBook() {
        System.out.println("Book returned to Public Library.");
    }
    public void catalogBooks() {
        System.out.println("Books cataloged in Public Library.");
    }
    public void issueCard() {
        System.out.println("Library card issued by Public Library.");
    }
    public void hostEvent() {
        System.out.println("Event hosted by Public Library.");
    }
    public void provideStudyRoom() {
        System.out.println("Study room provided by Public Library.");
    }
    public void manageMembership() {
        System.out.println("Membership managed by Public Library.");
    }
    public void extendDueDate() {
        System.out.println("Due date extended by Public Library.");
    }
    public void chargeLateFee() {
        System.out.println("Late fee charged by Public Library.");
    }
}
