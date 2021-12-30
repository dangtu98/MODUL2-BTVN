package miites30_12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStudent {
    public static final String PATH_NAME = "src/miites30_12/hocsinh.csv";
    private final ArrayList<Student> students;
    private final Scanner scanner = new Scanner(System.in);

    public ArrayList<Student> getStudents() {
        return students;
    }
    public ManagerStudent() {
        this.students = new ArrayList<>();
    }

    public void addStudent(){
        Student student = null;
        System.out.println("nhập id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("điểm toán");
        double toan = scanner.nextDouble();
        System.out.println("điểm lý");
        double ly = scanner.nextDouble();
        System.out.println("điểm hóa");
        double hoa = scanner.nextDouble();
        student = new Student(id , name , age ,toan ,ly , hoa);
        students.add(student);
        writeFile(students,PATH_NAME);
    }

    public Student deleteStudent(int id){
        Student student = null;
        for (Student s : students){
            if (s.getId() == id){
                student = s;
            }
        }
        int index = students.indexOf(student);
        students.remove(index);
        return student;
    }

    public Student studentEdit(int id){
        Student student = null;
        for (Student s : students){
            if (s.getId() == id){
                student = s;
            }
        }
        if (student != null){
            int index = students.indexOf(student);
            System.out.println("nhập id mới");
            int id1 = scanner.nextInt();
            student.setId(id1);
            scanner.nextLine();
            System.out.println("nhập tên mới");
            String name = scanner.nextLine();
            student.setName(name);
            System.out.println("nhập tuổi mới");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("điểm toán mới");
            double toan = scanner.nextDouble();
            student.setDiemToan(toan);
            System.out.println("điểm lý mới");
            double ly = scanner.nextDouble();
            student.setDiemLy(ly);
            System.out.println("điểm hóa mới");
            double hoa = scanner.nextDouble();
            student.setDiemHoa(hoa);
            students.set(index,student);
            writeFile(students,PATH_NAME);
        }
        return student;
    }

    public void displayStudent(){
        for (Student e : students){
            System.out.println(e);
        }
    }

    public ArrayList<Student> displayAverage(){
        ArrayList<Student> student1 = new ArrayList<>();
        double maxAverage = 0;
        for (Student e : students){
            if (e.AverageStudent() > maxAverage) {
                maxAverage = e.AverageStudent();
            }
        }
        for (Student h : students){
            if (h.AverageStudent() == maxAverage){
                student1.add(h);
            }
        }
        return student1;
    }

    public void writeFile(ArrayList<Student> students ,String path){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students){
                bufferedWriter.write(student.getId() + "," + student.getName() + "," + student.getAge() + ","
                + student.getDiemToan() + "," + student.getDiemLy() + "," + student.getDiemLy());
            }
            bufferedWriter.close();
            System.out.println("ghi file thành công");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static ArrayList<Student> readFile(String path){
        ArrayList <Student> students1 = new ArrayList<>();
        File file = new File(PATH_NAME);
        try{
            if (!file.exists()){
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) !=null){
                String [] st = line.split(",");
                students1.add(new Student(Integer.parseInt(st[0]), st[1], Integer.parseInt(st[2]), Double.parseDouble(st[3]), Double.parseDouble(st[4]),Double.parseDouble(st[5])));
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        return students1;
    }
}
