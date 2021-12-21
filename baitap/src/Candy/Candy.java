package Candy;

public class Candy {
    private int id;
    private String color;
    private String type;
    private int quantity;
    private int unit;

    public Candy() {
    }

    public Candy(int id, String color, String type, int quantity, int unit) {
        this.id = id;
        this.color = color;
        this.type = type;
        this.quantity = quantity;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                ", unit=" + unit +
                '}';
    }
}
