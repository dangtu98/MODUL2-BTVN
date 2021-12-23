package Minites23_12;

public class Student extends  Human{
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(double diemToan, double diemLy, double diemHoa) {
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public Student(String name, int age, double diemToan, double diemLy, double diemHoa) {
        super(name, age);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
    public double AverageStudent(){
        return (this.diemToan + this.diemLy + this.diemHoa) /3 ;
    }

}
