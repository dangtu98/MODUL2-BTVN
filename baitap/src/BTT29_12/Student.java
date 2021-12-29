package BTT29_12;

public class Student extends Human{
    private double average;

    public Student(double average) {
        this.average = average;
    }

    public Student(String name, int age, String gender, String address, double average) {
        super(name, age, gender, address);
        this.average = average;
    }

    public Student() {
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "average=" + average +
                '}';
    }
}
