import java.util.*;
class LibraryManager {
private List<Book> books = new ArrayList<>();
 
private List<Author> authors = new ArrayList<>();
private List<Borrower> borrowers = new ArrayList<>();

public void addBook(int id, String title, Author author) { Book book = new Book(id, title, author); books.add(book);
author.addBook(book);
}

public void addAuthor(int id, String name) { authors.add(new Author(id, name));
}

public void addBorrower(int id, String name) { borrowers.add(new Borrower(id, name));
}

public List<Book> getBooks() { return books; } public List<Author> getAuthors() { return authors; }
public List<Borrower> getBorrowers() { return borrowers; }

public void listBooks() { books.forEach(System.out::println); } public void listAuthors() { authors.forEach(System.out::println); }
public void listBorrowers() { borrowers.forEach(System.out::println); }

public void checkOutBook(int bookId, int borrowerId) { Book book = books.stream().filter(b -> b.getId() ==
bookId).findFirst().orElse(null);
Borrower borrower = borrowers.stream().filter(b -> b.getId() == borrowerId).findFirst().orElse(null);

if (book != null && borrower != null) { borrower.borrowBook(book);
} else {
System.out.println("Invalid book or borrower ID!");
}
}

public void checkInBook(int bookId, int borrowerId) { Book book = books.stream().filter(b -> b.getId() ==
bookId).findFirst().orElse(null);
Borrower borrower = borrowers.stream().filter(b -> b.getId() == borrowerId).findFirst().orElse(null);

if (book != null && borrower != null) { borrower.returnBook(book);
} else {
System.out.println("Invalid book or borrower ID!");
}
 
}
}
