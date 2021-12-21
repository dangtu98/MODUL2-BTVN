package Candy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageCandy manageCandy = new ManageCandy();
        int choice;
        do{
            System.out.println("MENU");
            System.out.println("1.Nhập loại kẹo");
            System.out.println("2.Hiện thị tất cả ");
            System.out.println("3.Thêm 1 viên kẹo theo id");
            System.out.println("4.Sửa 1 viên kẹo theo id");
            System.out.println("5.hiện thị kẹo theo id ");
            System.out.println("6.xóa kẹo theo màu");
            System.out.println("7.hiển thị kẹo theo màu");
            System.out.println("8.tìm kẹo giá cao nhất");
            System.out.println("9.tính giá kẹo");
            System.out.println("0.Exit");
            choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    manageCandy.addCandy(scanner);
                    break;
                case 2:
                    manageCandy.displayCandy();
                    break;



            }


        }while (choice !=0);


    }



}
