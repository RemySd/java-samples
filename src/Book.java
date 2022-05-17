public class Book {
    private int isbn;
    private String title;
    private String[] authors;

    public Book(int isbn, String title, String[] authors) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }
}
