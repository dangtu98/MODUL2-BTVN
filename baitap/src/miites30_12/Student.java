package miites30_12;

public class Student extends  Human{
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public Student(int i, String string, double diemToan, double diemLy, double diemHoa) {
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public Student(int id, String name, int age, double diemToan, double diemLy, double diemHoa) {
        super(id, name, age);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public Student(String string, int i, String s, String string1, double v) {
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
        return (this.diemHoa + this.diemLy + this.diemToan)/ 3;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "diemToan=" + diemToan +
                ", diemLy=" + diemLy +
                ", diemHoa=" + diemHoa +
                '}';
    }
}
