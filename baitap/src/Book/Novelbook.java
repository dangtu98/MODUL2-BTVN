package Book;

public class Novelbook extends Book{
    private String author;

    public Novelbook(String author) {
        this.author = author;
    }

    public Novelbook(String name, int price, int quantity, String date, String author) {
        super(name, price, quantity, date);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Novelbook{" + super.toString() +
                "author='" + author + '\'' +
                '}';
    }
}
