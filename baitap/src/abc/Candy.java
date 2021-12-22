package abc;

public class Candy {
    private static int VALUE = 0 ;
    private int Id;
    private String mauSac;
    private String tinhChat;
    private int soLuong;
    private double donGia;

    public Candy() {
    }

    public Candy(String mauSac, String tinhChat, int soLuong, double donGia) {
        this.Id = ++ VALUE;
        this.mauSac = mauSac;
        this.tinhChat = tinhChat;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getTinhChat() {
        return tinhChat;
    }

    public void setTinhChat(String tinhChat) {
        this.tinhChat = tinhChat;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "Id=" + Id +
                ", mauSac='" + mauSac + '\'' +
                ", tinhChat='" + tinhChat + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}
