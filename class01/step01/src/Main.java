public class Main {

    public static void main(String[] args) {
        Author author = new Author("Batman", "24");
        Book book = new Book("As aventuras loucas do Batman e Robin",
                             "123.456.789", author);

        author.print();
        book.print();

        author.setName("Joker");

        author.print();
        book.print();


        Author author2 = new Author("Ze do Bar", "171");

        if (author == author2) {
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
