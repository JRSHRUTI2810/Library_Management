
public class Book {
    private String title;
    private String author;
    private String isbn;
    private String category; // New field

    public Book(String title, String author, String isbn, String category) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
    }

    // Getters for existing fields
 public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getCategory() {
        return category;
    }
}

