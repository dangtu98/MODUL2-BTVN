package BTT29_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerStudent managerstudent = new ManagerStudent();

        int choice;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Add student");
            System.out.println("2. Update student by name");
            System.out.println("3. Delete student by name");
            System.out.println("4. Display students");
            System.out.println("5. Display students have Average greater than 7.5");
            System.out.println("6. Display students in format");
            System.out.println("7. Ghi file");
            System.out.println("8. Đọc file");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    managerstudent.addStudent();
                    break;
                case 2:
                    System.out.println("Input edit name: ");
                    scanner.nextLine();
                    String editName = scanner.nextLine();
                    System.out.println(managerstudent.editStudent(editName));
                    break;
                case 3:
                    System.out.println("Input delete name: ");
                    scanner.nextLine();
                    String deleteName = scanner.nextLine();
                    System.out.println(managerstudent.deleteStudent(deleteName));
                    break;
                case 4:
                    System.out.println("All Students: ");
                    managerstudent.displayALL();
                    break;
                case 5:
                    System.out.println("All Students By Average: ");
                    managerstudent.displayAverage();
                    break;
                case 6:
                    System.out.println("All Students In Format: ");
                    managerstudent.displayStudentFormat();
                    break;
                case 7:
                    managerstudent.writeFile(managerstudent.getStudents(), ManagerStudent.PATH_NAME);
                    break;
                case 8:
                    ArrayList<Student> students = managerstudent.readFile(ManagerStudent.PATH_NAME);
                    students.forEach(System.out::println);
                    break;
            }
        } while (choice != 0);
    }
}
