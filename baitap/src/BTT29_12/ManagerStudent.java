package BTT29_12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStudent {
    public static final String PATH_NAME ="src/BTT29_12/student.csv";
    private ArrayList<Student> students;
    private Scanner scanner = new Scanner(System.in);

    public ManagerStudent() {
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public boolean checkAgeAndAvenger(int age , double avenger){
           return (age >= 18 && age <=60 && !(avenger < 0) && !(avenger > 10));
    }

    public String getGenderByChoice(int choice){
        String gender ="";
        switch (choice){
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "Female";
                break;
            case 3:
                gender = "Other";
                break;
        }
        return gender;
    }

    public void  addStudent(){
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi :");
        int age = scanner.nextInt();
        System.out.println("Chọn giới tính :");
        System.out.println("1.Male");
        System.out.println("2.Female");
        System.out.println("3.Other");
        System.out.println("Bạn chọn :");
        int gender = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập địa chỉ : ");
        String address = scanner.nextLine();
        System.out.println("nhập điểm trung bình");
        double average = scanner.nextDouble();
        scanner.nextLine();
        if (checkAgeAndAvenger(age, average) && !getGenderByChoice(gender).equals("")){
            students.add(new Student(name , age , getGenderByChoice(gender),address,average));
            writeFile(students , PATH_NAME);
        }else {
            System.out.println("Lỗi nhập dữ liệu, vui lòng kiểm tra lại");
        }
    }

    public Student editStudent(String name) {
        Student studentEdit = null;
        for (Student e : students) {
            if (e.getName().equals(name)) {
                studentEdit = e;
            }
        }
        if (studentEdit != null) {
            int index = students.indexOf(studentEdit);
            System.out.println("nhập tên: ");
            String name1 = scanner.nextLine();
            studentEdit.setName(name1);
            System.out.println("nhập tuổi :");
            int age = scanner.nextInt();
            studentEdit.setAge(age);
            System.out.println("Chọn giới tính: ");
            System.out.println("1.Male");
            System.out.println("2.Female");
            System.out.println("3.Other");
            System.out.println("Bạn chọn :");
            int gender = scanner.nextInt();
            scanner.nextLine();
            System.out.println("nhập địa chỉ: ");
            String address = scanner.nextLine();
            studentEdit.setAddress(address);
            System.out.println("nhập điểm trung bình: ");
            double average = scanner.nextDouble();
            studentEdit.setAverage(average);
            scanner.nextLine();
            if (checkAgeAndAvenger(studentEdit.getAge(), studentEdit.getAverage()) && !getGenderByChoice(gender).equals("")) {
                studentEdit.setGender(getGenderByChoice(gender));
                students.set(index ,studentEdit);
                writeFile(students,PATH_NAME);
            } else {
                System.out.println("Lỗi nhập dữ liệu, vui lòng kiểm tra lại");
            }
        }
        return studentEdit;
    }

    public Student deleteStudent(String name){
        Student studentDelete = null;
        for (Student e : students){
            if (e.getName().equals(name)){
                studentDelete = e;
            }
        }
        int index = students.indexOf(studentDelete);
        students.remove(index);
        writeFile(students , PATH_NAME);
        return studentDelete;
    }

    public void displayALL(){
        if(students.isEmpty()){
            System.out.println("List Student Rỗng");
        }
        for (Student student : students){
            System.out.println(student);
        }
    }

    public void displayAverage(){
        for (Student student : students){
            if (student.getAverage() >= 7.5){
                System.out.println(student);
            }
        }
    }

    public void displayStudentFormat(){
       if (students.isEmpty()){
           System.out.println("List Student Rỗng");
       }
       for (Student student : students){
           if (student.getAverage() > 8.0){
               System.out.println(student.getName()+ student.getAverage() + "Good");
           }else if (student.getAverage() > 6.0){
               System.out.println(student.getName() + student.getAverage() + "Pretty");
           }else if (student.getAverage() > 4.0){
               System.out.println(student.getName() + student.getAverage() + "Normal");
           }else {
               System.out.println(student.getName() + student.getAverage() + "Weak");
           }
       }
    }

    public void writeFile(ArrayList <Student> students , String path){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students){
                bufferedWriter.write(student.getName()+ "," + student.getAge()+ "," + student.getGender() +
                        "," + student.getAddress() + "," + student.getAverage());
            }
            bufferedWriter.close();
            System.out.println("Ghi File thành công");
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile(String path){
        ArrayList <Student> students1 = new ArrayList<>();
        File file = new File(PATH_NAME);
        try{
            if (!file.exists()){
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] strings = line.split(",");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]), strings[2], strings[3], Double.parseDouble(strings[4])));
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        return students1;
    }


}
