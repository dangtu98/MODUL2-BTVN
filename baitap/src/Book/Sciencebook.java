package Book;

public class Sciencebook extends Book {
    private String type;

    public Sciencebook(String type) {
        this.type = type;
    }

    public Sciencebook(String name, int price, int quantity, String date, String type) {
        super(name, price, quantity, date);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sciencebook{" + super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
