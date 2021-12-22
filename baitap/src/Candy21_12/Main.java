package Candy21_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MangerCandy mangerCandy = new MangerCandy();
        int choice;

        do{
            System.out.println("MENU");
            System.out.println("1.hiện thị tất cả kẹo");
            System.out.println("2.thêm 1 viên kẹo");
            System.out.println("3.xóa 1 viên kẹo theo id");
            System.out.println("4.sửa 1 viên kẹo theo id");
            System.out.println("5.hiện thị viên kẹo theo id");
            System.out.println("6.xóa viên kẹo theo màu");
            System.out.println("7.hiện thị các viên kẹo theo màu");
            System.out.println("8.tìm viên kẹo có đơn giá cao nhất");
            System.out.println("9.tính giá thành của viên kẹo");
            System.out.println("0.Exit");
            choice = scanner.nextInt();

            switch (choice){
                case  1:
                    mangerCandy.displayAll();
                    break;
                case  2:
                    Candy candy = mangerCandy.createCandy();
                    mangerCandy.addCandy(candy);
                    break;
                case  3:
                    System.out.println("nhập vào id muốn xóa");
                    int iddelete = scanner.nextInt();
                    Candy candy1 = mangerCandy.deleteCandy(iddelete);
                    if (candy1 == null){
                        System.out.println("không có id tương ứng");
                    }else {
                        System.out.println(candy1);
                    }
                    break;
                case  4:
                    System.out.println("nhập vào id muốn sửa");
                    int idedit = scanner.nextInt();
                    Candy candy2 = mangerCandy.editCandy(idedit);
                    if (candy2 == null){
                        System.out.println("không có id tương ứng");
                    }else {
                        System.out.println(candy2);
                    }
                    break;
                case  5:
                    System.out.println("nhập vào id muốn");
                    int idplayer = scanner.nextInt();
                    mangerCandy.displayCandyId(idplayer);
                    break;
                case  6:
                    System.out.println("nhập vào màu muốn xóa");
                    scanner.nextLine();
                    String colorDelete = scanner.nextLine();
                    ArrayList <Candy> arrayList1 = mangerCandy.deleteColor(colorDelete);
                    System.out.println(arrayList1);
                    break;
                case  7:
                    System.out.println("nhập vào màu muốn hiện thị");
                    scanner.nextLine();
                    String colorDisplay = scanner.nextLine();
                    ArrayList<Candy> arrayList2 = mangerCandy.displayAllColor(colorDisplay);
                    System.out.println(arrayList2);
                    break;
                case  8:
                       ArrayList<Candy> arrayList3 = mangerCandy.maxAmount();
                    System.out.println(arrayList3);
                case  9:
                    System.out.println("nhập màu muốn tính giá thành");
                    String color1 = scanner.nextLine();
                     mangerCandy.dissplayPrice(color1);
                    System.out.println(color1);
            }

        }while (choice !=0);
    }
}
