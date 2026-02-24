import java.util.*;
class Borrower { private int id;
private String name;
private List<Book> borrowedBooks = new ArrayList<>();

public Borrower(int id, String name) { this.id = id;
this.name = name;
}

public int getId() { return id; }
public String getName() { return name; }
public List<Book> getBorrowedBooks() { return borrowedBooks; }

public void borrowBook(Book book) { if (!book.isBorrowed()) {
borrowedBooks.add(book); book.borrowBook();
} else {
System.out.println("Book is already borrowed!");
}
}

public void returnBook(Book book) {
if (borrowedBooks.contains(book)) { borrowedBooks.remove(book); book.returnBook();
} else {
System.out.println("Book not found in borrower's possession!");
}
}

@Override
public String toString() {
return "Borrower ID: " + id + ", Name: " + name + ", Books Borrowed: "
+ borrowedBooks.size();
}
}
