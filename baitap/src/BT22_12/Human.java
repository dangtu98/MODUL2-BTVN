package BT22_12;

public class Human{
    private String ten;
    private String tuoi;
    private String gioitinh;
    private String diachi;

    public Human() {
    }

    public Human(String ten, String tuoi, String gioitinh, String diachi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "Human{" +
                "ten='" + ten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
