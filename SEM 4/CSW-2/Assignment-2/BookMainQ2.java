class Book {
    private int bookId;
    private String bookName;
    private double price;

    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Name: " + bookName + ", Price: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Double.compare(book.price, price) == 0;
    }
}
public class BookMainQ2 {
    public static void main(String[] args) {
        // Instantiating two Book objects
        Book book1 = new Book(101, "Java ", 150);
        Book book2 = new Book(102, "Python ", 200);

        System.out.println("Book Details:");
        System.out.println(book1);
        System.out.println(book2);

        if (book1.equals(book2)) {

            System.out.println("Both books have the same price.");
        } else {
            System.out.println("The books have different prices.");
        }
    }
}
