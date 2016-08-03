/**
 * Created by sbmmartins on 8/3/16.
 */
public class Book {
    private String name;
    private String isbn;
    private Author author;


    public Book(String name, String isbn, Author author) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
    }

    public Book(Author author) {
        this("", "XXXXXXX", author);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void print() {
        System.out.println("-----------------");
        System.out.println("- Book: " + this.name);
        System.out.println("- ISBN: " + this.isbn);
        System.out.println("-----------------");
        this.author.print();
    }
}
