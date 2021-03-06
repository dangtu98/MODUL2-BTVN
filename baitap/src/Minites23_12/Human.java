package Minites23_12;

public class Human {
    private static int VALUE = 0;
    private int code;
    private String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.code = ++VALUE;
        this.name = name;
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    @Override
    public String toString() {
        return "Human{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
