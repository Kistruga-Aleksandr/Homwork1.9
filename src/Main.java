

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Ը���", "�����������");
        Book book = new Book(1868, "�����", author);
        Author author1 = new Author("���", "�������");
        Book book1 = new Book(1868, "����� � ���", author1);
        book1.setYear(1873);
    }
}
