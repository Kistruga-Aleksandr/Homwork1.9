public class Book {
    Author author;
    private int year;
    private final String title;

    public Book(int year, String title, Author author) {
        this.year = year;
        this.title = title;
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
