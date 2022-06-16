

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Фёдор", "Достоевский");
        Book book = new Book(1868, "Идиот", author);
        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book(1868, "Война и мир", author1);
        book1.setYear(1873);
        System.out.println(book.toString());
        System.out.println(book1.toString());
        if (book.equals(book1)) {
            throw new IllegalArgumentException("Такая книга уже есть.");
        }else {
            System.out.println("Можно сохранить книку ");
        }
    }
}
