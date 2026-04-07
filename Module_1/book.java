public class Book {
    private String title;
    private String author;
    private float price;

    // Constructor for convenience
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Override toString to print book details
    @Override
    public String toString() {
        return "Title - " + title + "\nAuthor - " + author + "\nPrice - $" + String.format("%.2f", price);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", "James Clear", 30.00f);
        Book book2 = new Book("Sapiens", "Yuval Noah Harari", 25.00f);

        System.out.println("The first book object is:");
        System.out.println(book1);
        System.out.println("\nThe second book object is:");
        System.out.println(book2);
    }
}