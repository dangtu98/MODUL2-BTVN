package BT2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        int choice;
        do {
            System.out.println("menu lựa chọn");
            System.out.println("1.Thêm con vật,không trùng tên");
            System.out.println("2.Xóa 1 con vật vào tập hợp theo tên ");
            System.out.println("3.Sửa 1 con vật theo tên");
            System.out.println("4.Hiển thị thông tin 1 con vật theo tên nhập vào");
            System.out.println("5.Hiển thị tất cả các con vật trong tập hợp");
            System.out.println("6.Trả về tất cả các con Dog trong tập hợp");
            System.out.println("7.Trả về tất cả các con vật trong khoảng cân nặng được nhập vào");
            System.out.println("8.Exit");
            System.out.println("-----------------------------------------");
            System.out.println("Chọn Menu");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;


            }
        }while (choice !=0);
    }


}
