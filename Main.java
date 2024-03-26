public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in the library:");
        library.displayBooks();

        String authorToSearch = "Harper Lee";
        System.out.println("Books by author " + authorToSearch + ":");
        for (Book book : library.searchByAuthor(authorToSearch)) {
            System.out.println(book.getTitle());
        }

        String titleToSearch = "The Great Gatsby";
        System.out.println("Books with title " + titleToSearch + ":");
        for (Book book : library.searchByTitle(titleToSearch)) {
            System.out.println(book.getAuthor());
        }
    }
}

