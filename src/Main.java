import javax.naming.InvalidNameException;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(2020,"Ivan Ivanov");
        Author author = new Author("Ivan", "Ivanov");
        Book book1 = new Book(2000,"Aleksandr Kistruga");
        Author author1 = new Author("Aleksandr","Kistruga");
        book.setYear(2022);
    }
}
