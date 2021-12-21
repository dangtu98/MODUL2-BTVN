package BT2012.Main;

import BT2012.Manager.Manager;
import BT2012.Model.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Thêm 1 animal");
            System.out.println("2. Xóa 1 animal theo tên");
            System.out.println("3. Sửa 1 animal theo tên");
            System.out.println("4. Hiển thị 1 animal theo tên");
            System.out.println("5. Hiển thị tất cả");
            System.out.println("6. Hiển thị tất cả Dog");
            System.out.println("7. Hiển thị theo khoảng cân nặng");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("nhập lựa chọn con vật muốn tạo");
                        System.out.println("1.Animal");
                        System.out.println("2.Dog");
                        System.out.println("3.Cat");
                        System.out.println("4.Mouse");
                        System.out.println("0.Exit");
                        choice1 = scanner.nextInt();
                        if (choice1 != 0 && !manager.addAnimal(choice1)) {
                            System.out.println("tên bị trùng , nhập lại");
                            System.out.println();
                        }

                    } while (choice1 != 0);
                    break;
                case 2:
                    System.out.println("nhập vào tên muốn xóa ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    Animal animal = manager.deleteAnimal(name);
                    if (animal == null){
                        System.out.println("xóa không thành công");
                    }else {

                    }

            }
        } while (choice != 0);

    }
}
