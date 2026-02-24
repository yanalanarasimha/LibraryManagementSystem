import java.util.*;
class Author { private int id;
private String name;
private List<Book> books = new ArrayList<>();

public Author(int id, String name) { this.id = id;
this.name = name;
}

public int getId() { return id; }
public String getName() { return name; } public List<Book> getBooks() { return books; }

public void addBook(Book book) { books.add(book); }
 
@Override
public String toString() {
return "Author ID: " + id + ", Name: " + name + ", Books Written: " + books.size();
}
}
