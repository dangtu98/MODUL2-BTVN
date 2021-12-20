package Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số lượng sinh viên");
        int size = scanner.nextInt();
        Student[] students = new Student[size];
        studentListArray(scanner , students);
        StudentManager studentManagers = new StudentManager();

        while (choice !=0 ){
            System.out.println("menu lựa chọn");
            System.out.println("1.Hiện thị tất cả sinh viên");
            System.out.println("2.hiện thị số điểm cao nhất ");
            System.out.println("3.Hiện thị số điểm thấp nhất");
            System.out.println("4.Thêm sinh viên");
            System.out.println("5.Xóa sinh viên theo tên");
            System.out.println("6.Tìm kiếm sinh viên theo tên");
            System.out.println("7.Hiện thị sinh viên theo giới tính");
            System.out.println("8.Sắp sếp sinh viên theo điểm trung bình");
            System.out.println("9.Exit");
            System.out.println("-----------------------------------------");
            System.out.println("Chọn Menu");
            choice = scanner.nextInt();
            switch (choice){
                case 1 :
                    studentManagers.displayStudent(students);
                    break;
                case 2 :
                    studentManagers.maxStudenMedium(students);
                    break;
                case 3 :
                    studentManagers.minStudenMedium(students);
                    break;
                case 4 :
            }
        }
    }

    public static Student studentList(Scanner scanner) {
        System.out.println("nhập vào tên sinh viên");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("nhập vào tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập vào giới tính ");
        String sex = scanner.nextLine();
        System.out.println("nhập vào địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập vào điểm");
        double medium = scanner.nextDouble();
        return new Student(name, age, sex, address, medium);
    }

    private static void studentListArray(Scanner scanner , Student[] students ) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("nhập sinh viên thứ " + (i + 1));
            students[i] = studentList(scanner);
        }
    }

}
