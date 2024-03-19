package Book;

public class Main {

    public static void main(String[] args) {

        Author author = new Author("Л. Н. Толстой", true, "lntolstpy@mail.ru");
        Book book = new Book("Война и мир", author, 1873);

        author.getInfo();
        book.getInfo();

        author.setName("А. А. Ахматова");
        author.setSex(false);
        author.setEmail("aaahmatova@mail.ru");
        book.setYear(2013);
        book.setTitle("Реквием");

        author.getInfo();
        book.getInfo();

    }

}
