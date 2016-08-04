public class Main {

    public static void main(String[] args) {
        Author author = new Author("Batman", "24");
        PocketBook pbook = new PocketBook("As aventuras loucas do Batman e Robin",
                                "123.456.789", 100.0, author);

        pbook.print();
    }
}
