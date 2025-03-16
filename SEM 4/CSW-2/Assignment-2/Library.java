import java.util.HashMap;
import java.util.Map;
class Book2 {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book2(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Author: " + author + ", Quantity: " + quantity;
    }
}
public class Library {
    public static void main(String[] args) {
        HashMap<Integer, Book2> books = new HashMap<>();

        books.put(1, new Book2(1, "Java Programming", "James Gosling", 5));
        books.put(2, new Book2(2, "Data Structures", "Robert Lafore", 8));
        // Displaying the collection of books
        System.out.println("Library Collection:");
        for (Map.Entry<Integer, Book2> entry : books.entrySet()) {
            System.out.println(entry.getValue());
        }
        // (a) Check if a particular book name is present
        String searchBook = "Java Programming";
        boolean found = false;
        for (Book2 book : books.values()) {
            if (book.getName().equals(searchBook)) {
                found = true;
                break;
            }
        }
        System.out.println("\nIs '" + searchBook + "' available? " + found);

        // (b) Remove a book entry by key
        int removeId = 1;
        books.remove(removeId);
        System.out.println("\nBook with ID " + removeId + " removed.");

        // Display updated book collection
        System.out.println("\nUpdated Library Collection:");
        for (Book2 book : books.values()) {
            System.out.println(book);
        }
    }
}
