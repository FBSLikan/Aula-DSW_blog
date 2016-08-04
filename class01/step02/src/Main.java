public class Main {

    public static void main(String[] args) {
        Author author = new Author("Batman", "24");
        Book book = new Book("As aventuras loucas do Batman e Robin",
                             "123.456.789", 100.0, author);

        book.print();

        book.applyDiscount(0.3);

        book.print();
    }
}
