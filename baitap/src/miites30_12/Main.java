package miites30_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
               ManagerStudent managerStudent = new ManagerStudent();
               Scanner scanner = new Scanner(System.in);
               int choice;
               do{
                   System.out.println("-----MENU-----");
                   System.out.println("1. nhập student");
                   System.out.println("2. xóa sv");
                   System.out.println("3. sửa sv");
                   System.out.println("4. Hiển thị tất ");
                   System.out.println("5. Hiển thị sv có điểm TB cao nhất");
                   System.out.println("6. Ghi file");
                   System.out.println("7. Đọc file");
                   System.out.println("0. Exit");
                   System.out.println("Nhập chọn: ");
                   choice = scanner.nextInt();
                   switch (choice){
                       case 1 :
                           managerStudent.addStudent();
                           break;
                       case 2:
                           System.out.println("nhập id ");
                           int id = scanner.nextInt();
                           Student st = managerStudent.deleteStudent(id);
                           if (st == null){
                               System.out.println("không có mã id");
                           }else {
                               System.out.println(st);
                           }
                           break;
                       case 3:
                           System.out.println("nhập id");
                           int id1 = scanner.nextInt();
                           Student s1 =  managerStudent.studentEdit(id1);
                           if (s1 == null){
                               System.out.println("không có mã id");
                           }else {
                               System.out.println(s1);
                           }
                           break;
                       case 4:
                           managerStudent.displayStudent();
                           break;
                       case 5:
                           ArrayList<Student> st1 = managerStudent.displayAverage();
                           System.out.println(st1);
                           break;
                       case 6:
                           managerStudent.writeFile(managerStudent.getStudents(), ManagerStudent.PATH_NAME);
                           break;
                       case 7:
                           ArrayList<Student> students = ManagerStudent.readFile(ManagerStudent.PATH_NAME);
                           students.forEach(System.out::println);
                           break;
                   }
               }while (choice != 0);

    }
}
