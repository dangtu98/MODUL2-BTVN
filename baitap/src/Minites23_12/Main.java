package Minites23_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerStudent managerStudent = new ManagerStudent();
        int choice;
        do{
            System.out.println("MENU");
            System.out.println("1.Hiện thị sinh viên");
            System.out.println("2.Thêm sinh viên");
            System.out.println("3.Sửa Sinh viên");
            System.out.println("4.xóa sinh viên");
            System.out.println("5.Tìm kiếm sinh viên");
            System.out.println("6.Sinh viên có điểm TB cao nhất là");
            choice = scanner.nextInt();
            switch (choice){
                case  1 :
                    managerStudent.displayALL();
                    break;
                case 2:
                    Student st = managerStudent.createStudent();
                    managerStudent.addStudent(st);
                    break;
                case 3:
                    System.out.println("nhập code ");
                    int cd = scanner.nextInt();
                    Student st1 = managerStudent.editStudent(cd);
                    if (st1 == null){
                        System.out.println("không có mã code");
                    }else {
                        System.out.println(st1);
                    }
                case  4:
                    System.out.println("nhập code");
                    int cd1 = scanner.nextInt();
                    Student st2 = managerStudent.deleteStudent(cd1);
                    if (st2 == null){
                        System.out.println("không có code");
                    }else {
                        System.out.println(st2);
                    }
                case 5:
                    System.out.println("nhập code");
                    int cd3 = scanner.nextInt();
                    Student st3 = managerStudent.searchStudent(cd3);
                    if (st3 == null){
                        System.out.println("không có code");
                    }else {
                        System.out.println(st3);
                    }
                case 6:
                    ArrayList<Student> student1 = managerStudent.AverageStudent();
                    System.out.println(student1);
            }



        }while (choice !=0);
    }
}
