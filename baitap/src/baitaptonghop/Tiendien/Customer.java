package baitaptonghop.Tiendien;

public class Customer {
    private String name;
    private int homeNumber;
    private int idElectric;

    public Customer() {
    }

    public Customer(String name, int homeNumber, int idElectric) {
        this.name = name;
        this.homeNumber = homeNumber;
        this.idElectric = idElectric;
    }

    public String getName() {
        return name;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public int getIdElectric() {
        return idElectric;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public void setIdElectric(int idElectric) {
        this.idElectric = idElectric;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", homeNumber=" + homeNumber +
                ", idElectric=" + idElectric +
                '}';
    }
}
