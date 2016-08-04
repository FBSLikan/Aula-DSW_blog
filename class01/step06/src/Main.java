public class Main {

    public static void main(String[] args) {
        Author author = new Author("Batman", "24");
        PrintedBook pbook = new PrintedBook("As aventuras loucas do Batman e Robin",
                                "123.456.789", 100.0, author, 50.0);

        pbook.applyDiscount(0.1);
        pbook.print();
    }
}
