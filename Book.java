import java.util.*;
class Book {
private int id; private String title; private Author author;
private boolean isBorrowed;

public Book(int id, String title, Author author) {
this.id = id; this.title = title; this.author = author;
this.isBorrowed = false;
}

public int getId() { return id; }
public String getTitle() { return title; } public Author getAuthor() { return author; }
public boolean isBorrowed() { return isBorrowed; }

public void borrowBook() { isBorrowed = true; } public void returnBook() { isBorrowed = false; }

@Override
public String toString() {
return "Book ID: " + id + ", Title: " + title + ", Author: " + author.getName() + ", Borrowed: " + isBorrowed;
}
}
