package BT29_12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStudent {
    private ArrayList<Student> students;
    private Scanner scanner = new Scanner(System.in);
    private File file = new File("src/BT29_12/sinhvien");

    public File getFile(){
        return file;
    }

    public void setStudents(ArrayList<Student>students) {
        this.students = students;
    }

    public ManagerStudent() {
        this.students = new ArrayList<>();
    }

    public Student createStudent(){
        Student student = null;
        System.out.println("nhập tên sv");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi sv");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập giới tính");
        String sex = scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập điểm trung bình");
        double average = scanner.nextDouble();
        student = new Student(name,age,sex,address,average);
        students.add(student);
        writeToFile(file);
        return student;
    }

//    public void addStudent(Student student){
//        students.add(student);
//        writeToFile(file);
//    }

    public void deleteStudent(String name){
        Student student = null;
        for(Student e : students){
            if (e.getName().equals(name)){
                student = e;
            }
        }
        int index = students.indexOf(student);
        writeToFile(file);
        students.remove(index);
    }

    public void displayALL(){
        for (Student student : students){
            System.out.println(student);
        }
    }

    public Student editStudent(String name) {
        Student student = null;
        for (Student e : students) {
            if (e.getName().equals(name)) {
                student = e;
            }
        }
        if (student != null) {
            int index = students.indexOf(student);
            scanner.nextLine();
            System.out.println("nhập tên mới");
            String name1 = scanner.nextLine();
            student.setName(name1);
            System.out.println("nhập tuổi mới");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("nhập giới tính mới");
            String sex = scanner.nextLine();
            student.setSex(sex);
            scanner.nextLine();
            System.out.println("nhập địa chỉ mới");
            String address = scanner.nextLine();
            student.setAddress(address);
            System.out.println("nhập điểm trung bình mới");
            double average = scanner.nextDouble();
            student.setAveragePoint(average);
            students.set(index, student);
            writeToFile(file);
        }
        return student;
    }

    public ArrayList<Student> displayStudentPoin(){
         ArrayList<Student> students1 = new ArrayList<>();
         for (Student e : students){
             if (e.getAveragePoint() >= 7.5){
                 students1.add(e);
             }
         }
          return  students1;
    }

    public void writeToFile(File file){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(students);
            oss.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Student> readFromFile(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new java.io.ObjectInputStream(fis);
            students = (ArrayList<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
