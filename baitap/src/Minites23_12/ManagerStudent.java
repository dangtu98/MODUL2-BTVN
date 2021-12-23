package Minites23_12;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStudent {
    private ArrayList <Student> students;
    private Scanner scanner = new Scanner(System.in);

    public ManagerStudent() {
        this.students = new ArrayList<>();
    }


    public void displayALL(){
        for (Student e : students){
            System.out.println(e);
        }
    }

    public Student createStudent(){
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("nhập điểm toán");
        double toan = scanner.nextDouble();
        System.out.println("nhập điểm lý");
        double ly = scanner.nextDouble();
        System.out.println("nhập điểm hóa");
        double hoa = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name , age ,toan , ly , hoa);
    }

    public void  addStudent(Student student){
        students.add(student);
        System.out.println(student);
    }

    public Student deleteStudent(int code){
        Student student = null;
        for (Student e : students){
            if (e.getCode() == code){
                student = e;
            }
        }
        int index = students.indexOf(student);
       return students.remove(index);
    }

    public Student editStudent(int code){
        Student student = null;
        for (Student e : students){
            if (e.getCode() == code){
                student = e;
            }
        }
        if (student != null){
            int index = students.indexOf(student);
            System.out.println("nhập tên mới");
            String name = scanner.nextLine();
            student.setName(name);
            System.out.println("nhập tuổi mới ");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("nhập điểm toán mới");
            double toan = scanner.nextDouble();
            student.setDiemToan(toan);
            System.out.println("nhập điểm lý mới ");
            double ly = scanner.nextDouble();
            student.setDiemLy(ly);
            System.out.println("nhập điểm hóa mới");
            double hoa = scanner.nextDouble();
            student.setDiemHoa(hoa);
            students.set(index,student);
        }
        return student;
    }

    public Student searchStudent(int code){
        Student student = null;
        for (Student e : students){
            if (e.getCode() == code){
                student = e;
            }
        }
        return student;
    }

    public ArrayList<Student> AverageStudent(){
           ArrayList<Student> st = new ArrayList<>();
        double maxAverage  = 0;
        for (Student e : students){
            if (e.AverageStudent() > maxAverage){
                maxAverage = e.AverageStudent();
            }
        }
        for(Student e : students){
            if (e.AverageStudent() == maxAverage){
                st.add(e);
            }
        }
       return st;
    }



}
