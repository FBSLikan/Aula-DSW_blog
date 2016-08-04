/**
 * Created by sbmmartins on 8/3/16.
 */
public abstract class Book {
    private String name;
    private String isbn;
    private Author author;
    private double price;


    public Book(String name, String isbn, double price, Author author) {
        this.name = name;
        this.isbn = isbn;
        this.price = price;
        this.author = author;
    }

    public Book(Author author) {
        this("", "XXXXXXX", 0.0, author);
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
        System.out.println("- Price: " + this.price);
        System.out.println("-----------------");
        this.author.print();
    }

    public boolean applyDiscount(double perc) {
        if (perc > 0.3)
            return false;
        else {
            this.price -= (this.price * perc);
            return true;
        }
    }
}





