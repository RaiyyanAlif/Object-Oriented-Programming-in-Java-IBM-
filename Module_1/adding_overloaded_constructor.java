// Book.java
public class Book {
    private String title;
    private String author;
    private float price;

    // Default constructor
    public Book() {
        this.title = null;
        this.author = null;
        this.price = 0.0f;
    }

    // Parameterized constructor
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    // toString method to display book details
    @Override
    public String toString() {
        return "Title - " + this.title + "\nAuthor - " + this.author + "\nPrice - $" + String.format("%.2f", this.price);
    }
}

// BookAccess.java
public class BookAccess {
    public static void main(String[] args) {
        // Using parameterized constructor
        Book book1 = new Book("Atomic Habits", "James Clear", 30.00f);

        // Using default constructor + setters
        Book book2 = new Book();
        book2.setTitle("Sapiens");
        book2.setAuthor("Yuval Noah Harari");
        book2.setPrice(25.00f);

        System.out.println("The first book object is:");
        System.out.println(book1);
        System.out.println("\nThe second book object is:");
        System.out.println(book2);
    }
}