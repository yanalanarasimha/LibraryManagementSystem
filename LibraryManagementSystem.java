import java.util.*;
public class LibraryManagementSystem { public static void main(String[] args) {
LibraryManager libraryManager = new LibraryManager(); Scanner scanner = new Scanner(System.in);

while (true) {
System.out.println("\nLibrary Management System:"); System.out.println("1. Add Author"); System.out.println("2. Add Book"); System.out.println("3. Add Borrower"); System.out.println("4. List Books"); System.out.println("5. List Authors"); System.out.println("6. List Borrowers"); System.out.println("7. Borrow Book"); System.out.println("8. Return Book"); System.out.println("9. Exit"); System.out.print("Choose an option: ");

int choice = scanner.nextInt(); scanner.nextLine();

switch (choice) { case 1:
System.out.print("Enter Author ID: "); int authorId = scanner.nextInt(); scanner.nextLine(); System.out.print("Enter Author Name: "); String authorName = scanner.nextLine();
libraryManager.addAuthor(authorId, authorName); break;
case 2:
System.out.print("Enter Book ID: "); int bookId = scanner.nextInt(); scanner.nextLine(); System.out.print("Enter Book Title: "); String bookTitle = scanner.nextLine(); System.out.print("Enter Author ID: "); int bookAuthorId = scanner.nextInt(); scanner.nextLine();
Author author = libraryManager.getAuthors().stream()
.filter(a -> a.getId() == bookAuthorId)
.findFirst().orElse(null); if (author != null) {
libraryManager.addBook(bookId, bookTitle, author);
} else {
System.out.println("Author not found!");
 
}
break; case 3:
System.out.print("Enter Borrower ID: "); int borrowerId = scanner.nextInt(); scanner.nextLine(); System.out.print("Enter Borrower Name: "); String borrowerName = scanner.nextLine();
libraryManager.addBorrower(borrowerId, borrowerName); break;
case 4:
libraryManager.listBooks();
break;
case 5:
libraryManager.listAuthors(); break;
case 6:
libraryManager.listBorrowers(); break;
case 7:
System.out.print("Enter Book ID to Borrow: "); int borrowBookId = scanner.nextInt(); System.out.print("Enter Borrower ID: ");
int borrowBorrowerId = scanner.nextInt(); libraryManager.checkOutBook(borrowBookId,
borrowBorrowerId);
break;
case 8:
System.out.print("Enter Book ID to Return: "); int returnBookId = scanner.nextInt(); System.out.print("Enter Borrower ID: ");
int returnBorrowerId = scanner.nextInt(); libraryManager.checkInBook(returnBookId,
returnBorrowerId);
break;
case 9:
System.out.println("Exiting System...");
scanner.close();
return; default:
System.out.println("Invalid option! Try again.");
}
}
}
}
