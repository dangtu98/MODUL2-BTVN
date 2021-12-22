package BT22_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerHuman managerHuman = new ManagerHuman();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("MENU");
            System.out.println("1.hiện thị tất cả người");
            System.out.println("2.hiện thị thêm người");
            System.out.println("3.Hiển thị tất cả nam");
            System.out.println("4.hiển thị tất cả nữa");
            System.out.println("5.hiển thị tất cả người dưới 20 tuổi");
            System.out.println("6.thêm 1 người");
            System.out.println("7.xóa 1 người theo tên");
            System.out.println("8.sửa 1 người theo tên");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    managerHuman.displayALL();
                    break;
                case 2:
                    Human human = managerHuman.CreateHuman();
                    managerHuman.addHuman(human);
                    break;
                case 3:
                    System.out.println("nhập giới tính Nam");
                    String gt = scanner.nextLine();
                    Human human1 = managerHuman.displayNam(gt);
                    System.out.println(human1);
                case 4:
                    System.out.println("nhập vào giới tính nữ");
                    String gt1 = scanner.nextLine();
                    Human human2 = managerHuman.displayNu(gt1);
                    System.out.println(human2);
                case 5:
                    
            }

        }while (choice !=0);
    }
}
