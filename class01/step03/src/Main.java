public class Main {

    public static void main(String[] args) {
        Author author = new Author("Batman", "24");
        EBook ebook = new EBook("As aventuras loucas do Batman e Robin",
                                "123.456.789", 100.0, author, "WATERMARK");

        ebook.applyDiscount(0.1);
        ebook.print();
//
//        book.applyDiscount(0.3);
//
//        book.print();
    }
}
