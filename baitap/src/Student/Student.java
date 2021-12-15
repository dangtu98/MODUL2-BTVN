package Student;

public class Student {
    private String name;
    private int age;
    private String sex;
    private String address;
    private double medium;

    public Student() {
    }

    public Student(String name, int age, String sex, String address, double medium) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.medium = medium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMedium() {
        return medium;
    }

    public void setMedium(double medium) {
        this.medium = medium;
    }

    @Override
    public String toString() {
        return "Student.Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", medium=" + medium +
                '}';
    }
}
