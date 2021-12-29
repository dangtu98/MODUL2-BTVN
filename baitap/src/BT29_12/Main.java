package BT29_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("MENU");
            System.out.println("1.Hiển thị tất cả sinh viên");
            System.out.println("2.Thêm nhập sinh viên");
            System.out.println("3.xóa sinh viên theo tên");
            System.out.println("4.sửa sinh viên theo tên");
            System.out.println("5.sinh viên có điểm trung bình trên 7,5");
            System.out.println("6.Đọc file");
            choice = scanner.nextInt();
            switch (choice){
                case  1:
                    managerStudent.displayALL();
                    break;
                case 2:
                    managerStudent.createStudent();
                    break;
                case 3:
                    System.out.println("nhập tên muốn xóa");
                    String name = scanner.nextLine();
                    managerStudent.deleteStudent(name);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("nhập tên muốn sửa");
                    String name1 = scanner.nextLine();
                    managerStudent.editStudent(name1);
                    break;
                case 5:
                    managerStudent.displayStudentPoin();
                    break;
                case 6:
                    managerStudent.setStudents(managerStudent.readFromFile(managerStudent.getFile()));
                    break;
            }
        }while (choice != 0);
    }
}
