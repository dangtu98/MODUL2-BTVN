package BT29_12;

public class Student extends Human{
    private double averagePoint;

    public Student() {
    }

    public Student(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    public Student(String name, int age, String sex, String address, double averagePoint) {
        super(name, age, sex, address);
        this.averagePoint = averagePoint;
    }


    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "averagePoint=" + averagePoint +
                '}';
    }
}
